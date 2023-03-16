package controle;

import javax.swing.JOptionPane;

public class ElseIf {
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
			JOptionPane.showMessageDialog(null, "Sua nota foi Muito ruim " + nota);

			/*
			 * JOptionPane.showConfirmDialog abre uma caixa onde vc tem quatro opições,
			 * entre sim, não, cancelar e o "X". Esses resultados geram 4 números int sendo
			 * Sim = 0 , Não = 1 , Cancelar = 2 & X = 3. A partir disso você conceguer criar
			 * uma aplicação com mais facilidade.
			 */
			int entrada2 = JOptionPane.showConfirmDialog(null, "Digite se deseja pagar a taxa para refazer a prova");

			if (entrada2 == 0) {
				JOptionPane.showMessageDialog(null, "Entrem no site da insituição e escolha uma data para realizar");
			} else if (entrada2 == 1) {
				JOptionPane.showMessageDialog(null, "Você terá que refazer o semestre.");
			} else {
				JOptionPane.showMessageDialog(null, "Resposta invalida");
			}

		} else if (nota >= 2 || nota < 5) {
			JOptionPane.showMessageDialog(null, "Sua nota foi baixa " + nota);
		} else if (nota >= 5 || nota < 6) {
			JOptionPane.showMessageDialog(null, "Sua nota foi regular " + nota);
		} else if (nota >= 6 || nota < 8) {
			JOptionPane.showMessageDialog(null, "Sua nota foi boa " + nota);
		} else if (nota >= 8 || nota < 9) {
			JOptionPane.showMessageDialog(null, "Sua nota foi ótima " + nota);
		} else if (nota >= 9 || nota <= 10) {
			JOptionPane.showMessageDialog(null, "Sua nota foi Exelente " + nota);
		}
	}
}
