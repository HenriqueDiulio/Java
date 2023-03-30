package desafios;

import javax.swing.JOptionPane;

public class Desafio_IMC {
	public static void main(String[] args) {
		// Declara de variaveis
		double imc, peso, altura;

		// recebendo valores com JOptionPane
		String entrada1 = JOptionPane.showInputDialog("Digite seu peso: ");
		String entrada2 = JOptionPane.showInputDialog("Digite sua altura: ");

		// conversão de String para double
		peso = Double.parseDouble(entrada1);
		altura = Double.parseDouble(entrada2);

		// Calculo de imc
		imc = peso / (altura * altura);
		
		
		// Resultado
		JOptionPane.showMessageDialog(null, "Seu IMC é: "+imc);

	}
}
