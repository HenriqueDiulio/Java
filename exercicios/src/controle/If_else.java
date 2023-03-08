package controle;

import javax.swing.JOptionPane;

public class If_else {

	public static void main(String[] args) {
		String valor;
		int num;

		valor = JOptionPane.showInputDialog("Digite um número: ");

		// trim remove os espaços que o usuário possa ter digitado, assim impedindo de
		// ocorrer um erro.
		num = Integer.parseInt(valor.trim());

		if (num % 2 == 0) {
			System.out.println(num + " é par");
		} else {
			System.out.println(num + " é ímpar");
		}
	}
}
