package desafios;

import javax.swing.JOptionPane;

public class calculo_notas_alunos {

	public static void main(String[] args) {
		// variaveis
		String entrada1, entrada2, entrada3;
		double nota1, nota2, nota3, soma;

		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de notas dos Alunos do Colegio Elefante");

		// recebendo notas // eliminado possiveis espaços utilizando trim()
		entrada1 = JOptionPane.showInputDialog("Digite sua primeira nota: ");
		entrada1 = entrada1.trim();
		nota1 = Double.parseDouble(entrada1);// conversão de String para double;

		entrada2 = JOptionPane.showInputDialog("Digite sua segunda nota: ");
		entrada2 = entrada2.trim();
		nota2 = Double.parseDouble(entrada2);// conversão de String para double;

		entrada3 = JOptionPane.showInputDialog("Digite sua segunda nota: ");
		entrada3 = entrada3.trim();
		nota3 = Double.parseDouble(entrada3);// conversão de String para double;

		// soma da nota do aluno
		soma = (nota1 + nota2 + nota3) / 2;

		// Primeiro if pega todas as notas invalidas;

		if (soma > 10 || soma < 0) {
			System.out.println("Nota " + soma + " invalida" + "\nDigite novamente a nota.");
		}
		// Recebendo nota do aluno, caso se enquadre, entre em um novo bloco de codigo;
		else if (soma >= 0 || soma < 2) {
			JOptionPane.showMessageDialog(null, "Sua nota foi Muito ruim " + soma);

			/*
			 * JOptionPane.showConfirmDialog abre uma caixa onde vc tem quatro opições,
			 * entre sim, não, cancelar e o "X". Esses resultados geram 4 números int sendo
			 * Sim = 0 , Não = 1 , Cancelar = 2 & X = 3. A partir disso você conceguer criar
			 * uma aplicação com mais facilidade.
			 */
			int resposta = JOptionPane.showConfirmDialog(null, "Digite se deseja pagar a taxa para refazer a prova");

			switch (resposta) {
			case 0:
				JOptionPane.showMessageDialog(null, "Entrem no site da insituição e escolha uma data para realizar");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Você terá que refazer o semestre.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Resposta invalida");
			}
		}

		else if (soma >= 2 || soma < 5) {
			JOptionPane.showMessageDialog(null, "Sua nota foi baixa " + soma);
		} else if (soma >= 5 || soma < 6) {
			JOptionPane.showMessageDialog(null, "Sua nota foi regular " + soma);
		} else if (soma >= 6 || soma < 8) {
			JOptionPane.showMessageDialog(null, "Sua nota foi boa " + soma);
		} else if (soma >= 8 || soma < 9) {
			JOptionPane.showMessageDialog(null, "Sua nota foi ótima " + soma);
		} else if (soma >= 9 || soma <= 10) {
			JOptionPane.showMessageDialog(null, "Sua nota foi Exelente " + soma);
		}
	}
}
