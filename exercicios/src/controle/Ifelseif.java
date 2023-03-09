package controle;

import javax.swing.JOptionPane;

public class Ifelseif {
	public static void main(String[] args) {

		// variaveis;
		double nota;
		String resposta = null;
		String entrada1, entrada2;

		// Entrada de dados;
		entrada1 = JOptionPane.showInputDialog("Digite sua nota: ");
		nota = Double.parseDouble(entrada1);

		// Primeiro if pega todas as notas invalidas;

		if (nota > 10 || nota < 0) {
			System.out.println("Nota " + nota + " invalida" + "\nDigite novamente a nota.");
		}
		// Recebendo nota do aluno, caso se enquadre entre em um novo bloco de codigo;
		else if (nota >= 0 || nota < 2) {
			System.out.println("Nota foi Muito ruim " + nota);

			entrada2 = JOptionPane.showInputDialog("Digite se deseja pagar a taxa para refazer a prova:(S/N)");

			// valor foi da variavel resposta foi convertido para maiusculo e removido
			// alguma espaço caso o usuário tenha escrevido errado;
			resposta = entrada2.toUpperCase();

			if (resposta == "S") {
				JOptionPane.showMessageDialog(null, "Entrem no site da insituição e escolha uma data para realizar",
						resposta, 0);
			} else if (resposta == "N") {
				System.out.println("Infelizmente o senhor tera que repetir o semestre.");
			} else {
				System.out.println("Resposta invalida");
			}
		} else if (nota >= 2 || nota < 5) {
			System.out.println("Nota foi baixa " + nota);
		} else if (nota >= 5 || nota < 6) {
			System.out.println("Nota foi regular " + nota);
		} else if (nota >= 6 || nota < 8) {
			System.out.println("Nota foi boa " + nota);
		} else if (nota >= 8 || nota < 9) {
			System.out.println("Nota foi ótima " + nota);
		} else if (nota >= 9 || nota <= 10) {
			System.out.println("Nota foi Exelente " + nota);
		}

	}
}
