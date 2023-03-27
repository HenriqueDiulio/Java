package Classe;

import java.util.Scanner;

public class Desafio_data_teste {
	public static void main(String[] args) {
		// variaveis para receber valores e setar
		int newDia , newMes, newAno;
		
		// instasiando class data
		Desafio_data data1 = new Desafio_data();
		Desafio_data data2 = new Desafio_data();
		
		// metodo scanner
		Scanner input = new Scanner(System.in);
		
		// recebendo data
		System.out.println("========== PRIMEIRA DATA =========="
				+ "\nDigite o dia: ");
		data1.dia = input.nextInt();// ele vai setar a data na variavel dia da classe data
		System.out.println("Digite o mes: ");
		data1.mes = input.nextInt();
		System.out.println("Digite o ano: ");
		data1.ano = input.nextInt();
		
		System.out.println("\n========== SEGUNDA DATA =========="
				+ "\nDigite o dia: ");
		data2.dia = input.nextInt();
		System.out.println("Digite o mes: ");
		data2.mes = input.nextInt();
		System.out.println("Digite o ano: ");
		data2.ano = input.nextInt();
	
		
		System.out.println("========== DATA 1 =========="
				+ "\nDIA: " + data1.dia);
		System.out.println("MES: "+data1.mes);
		System.out.println("ANO: "+data1.ano);
		
		System.out.println("==========  DATA 2 =========="
				+ "\nDIA: " + data2.dia);
		System.out.println("MES: "+data2.mes);
		System.out.println("ANO: "+data2.ano);
		
		input.close();
	}
}
