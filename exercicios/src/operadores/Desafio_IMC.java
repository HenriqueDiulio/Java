package operadores;

import javax.swing.JOptionPane;

public class Desafio_IMC {
	public static void main(String[] args) {

		double imc, peso, altura;

		String entrada1 = JOptionPane.showInputDialog("Digite seu peso: ");
		String entrada2 = JOptionPane.showInputDialog("Digite sua altura: ");

		peso = Double.parseDouble(entrada1);
		altura = Double.parseDouble(entrada2);

		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: "+imc);

	}
}
