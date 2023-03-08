package operadores;

import javax.swing.JOptionPane;

public class Desafio_calculadora {
	public static void main(String[] args) {
		
		// ENTRADA DE DADOS COM JOptonPane
				
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		String op = JOptionPane.showInputDialog("Escolha a operação:" + "\n1 - soma \n2 - subtração \n3 - multiplicação \n4  - divisão");
		
		// CONVERTENDO STRING PARA DOUBLE
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double operacao = Double.parseDouble(op);
		
		// ESTRUTURA DE DECISÃO 
		if (operacao == 1) {
			System.out.println(num1 + num2);	
		}
		
		else if (operacao == 2) {
			System.out.println(num1 - num2);
		}
		else if (operacao == 3) {
			System.out.println(num1 * num2);
		}
		else if (operacao == 4) {
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("ERRO!!! VOCE NAO ESCOLHEU NENHUMA OPERAÇÃO");
		}
	}
}
