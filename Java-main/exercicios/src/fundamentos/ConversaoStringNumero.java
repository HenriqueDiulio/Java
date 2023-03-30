package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		// Interface JOptionPane
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
		// concatenação
		System.out.println(valor1 + valor2);
		
		// Conversao de String pra numero
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		
		double soma = ( num1 + num2);
		
		System.out.println("A soma das variaveis é : "+soma);
		System.out.println("A média é: "+soma/2);
	}

}
