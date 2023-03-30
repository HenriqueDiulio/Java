package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {
	public static void main(String[] args) {

		// variaveis;
		int nota;
		String entrada1;

		// Entrada de dados principal: Aluno vai entrar com a nota

		entrada1 = JOptionPane.showInputDialog("Digite sua nota: ");
		nota = Integer.parseInt(entrada1);
		
		switch (nota) {
		case 0:
			JOptionPane.showMessageDialog(null, "Sua nota foi muito ruim " + nota);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Sua nota foi ruim " + nota);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Sua nota foi ruim " + nota);
			break; 
		case 3:
			JOptionPane.showMessageDialog(null, "Sua nota foi baixa " + nota);
			break; 
		case 4:
			JOptionPane.showMessageDialog(null, "Sua nota foi baixa " + nota);
			break; 
		case 5:
			JOptionPane.showMessageDialog(null, "Sua nota foi regular " + nota);
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sua nota foi regular " + nota);
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sua nota foi boa " + nota);
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Sua nota foi boa " + nota);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Sua nota foi ótima " + nota);
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Sua nota foi Exelente " + nota);
			break;
			default: JOptionPane.showMessageDialog(null, "nota nao informada...s");

		}
	}
}
