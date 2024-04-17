package arrays;

import javax.swing.JOptionPane;

public class Foreach {

	public static void main(String[] args) {

		//declarando um lista
		double notas[] = new double[6];
		
		for(int i = 0; i < 6; i++) {
			// Entrada de dados com String.
			String entrada1 = JOptionPane.showInputDialog("Digite sua nota: ");

			entrada1 = entrada1.trim();// Entrada de nota // trim e usado pra remover espaços

			double notas1= Double.parseDouble(entrada1);// conversão de String para double;
			
			// ele vai receber e armazenar as notas
			notas[i] = notas1;
		}
		
		// esse for vai mostrar as notas armazenadas
		System.out.println("FOR PARA EXIBIR A LISTA");
		for(int i = 0; i < 6; i++) {
			// ele vai exibir a posição de acordo com repeticao "i"
			System.out.println("A NOTA:"+notas[i]);
		}
		
		// FOREACH PARA EXIBIR A LISTA
		System.out.println("FOREACH PARA EXIBIR A LISTA");
		for(double contador: notas) {
			System.out.println(contador);
		}

	}
	
}
