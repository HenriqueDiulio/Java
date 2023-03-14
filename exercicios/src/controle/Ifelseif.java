package controle;

import javax.swing.JOptionPane;

public class Ifelseif {
	public static void main(String[] args) {

		// variaveis;
		double nota;
		String entrada1;

		// Entrada de dados principal: Aluno vai entrar com a nota

		entrada1 = JOptionPane.showInputDialog("Digite sua nota: ");
		nota = Double.parseDouble(entrada1);

		// Primeiro if pega todas as notas invalidas;

		if (nota > 10 || nota < 0) {
			System.out.println("Nota " + nota + " invalida" + "\nDigite novamente a nota.");
		}
		// Recebendo nota do aluno, caso se enquadre, entre em um novo bloco de codigo;
		else if (nota >= 0 || nota < 2) {
			System.out.println("Nota foi Muito ruim " + nota);

			 int entrada2 = JOptionPane.showConfirmDialog(null,"Digite se deseja pagar a taxa para refazer a prova");
			 
			if (entrada2 == 0) {
				JOptionPane.showMessageDialog(null, "Entrem no site da insituição e escolha uma data para realizar");
			}else if (entrada2 == 1) {
				JOptionPane.showMessageDialog(null, "Você terá que refazer o semestre.");
			}else {
				JOptionPane.showMessageDialog(null,"Resposta invalida");
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
