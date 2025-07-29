package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {
	private int colunas;
	private int minas;
	private int linhas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int colunas, int minas, int linhas) {
		this.colunas = colunas;
		this.minas = minas;
		this.linhas = linhas;

		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
					.ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}

	private void associarOsVizinhos() {
	    for (Campo campoAtual : this.campos) {
	        for (Campo vizinhoPotencial : this.campos) {
	            campoAtual.adicionarVizinho(vizinhoPotencial);
	        }
	    }
	}

	private void sortearMinas() {
	    long minasArmadas = 0;
	    
	    while(minasArmadas < minas) {
	        int aleatorio = (int) (Math.random() * campos.size());
	        Campo campoSorteado = campos.get(aleatorio);
	        
	        if(!campoSorteado.isMinado()) {
	            campoSorteado.minar();
	            minasArmadas++;
	        }
	    }
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		//sb.append > é para formatação das númerações superiores
		sb.append("  ");
		for (int c = 0; c < colunas; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}

		sb.append("\n");
		int i = 0;
		for (int l = 0; l < linhas; l++) {
			sb.append(l);
			sb.append(" "); 
			for (int c = 0; c < colunas; c++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}

		return sb.toString();
	}

}