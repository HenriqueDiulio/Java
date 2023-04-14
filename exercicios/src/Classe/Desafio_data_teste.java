package Classe;

import java.util.Scanner;

public class Desafio_data_teste {
	public static void main(String[] args) {

		// instasiando class data
		Desafio_data data1 = new Desafio_data(1, 2, 3);
		Desafio_data data2 = new Desafio_data(1,2,3);

		// metodo scanner
		Scanner input = new Scanner(System.in);

		// recebendo data
		System.out.println("========== PRIMEIRA DATA ==========" + "\nDigite o dia: ");
		data1.dia = input.nextInt();// ele vai setar a data na variavel dia da classe data
		System.out.println("Digite o mes: ");
		data1.mes = input.nextInt();
		System.out.println("Digite o ano: ");
		data1.ano = input.nextInt();

		System.out.println("\n========== SEGUNDA DATA ==========" + "\nDigite o dia: ");
		data2.dia = input.nextInt();
		System.out.println("Digite o mes: ");
		data2.mes = input.nextInt();
		System.out.println("Digite o ano: ");
		data2.ano = input.nextInt();

		System.out.println(data1.Formatacao());
		System.out.println(data2.Formatacao());
		
		input.close();
	}
}
