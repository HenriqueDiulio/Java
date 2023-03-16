package controle;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		String contador = "";

		Scanner input = new Scanner(System.in);

		// enquanto a palavra sair no for digitada ele ficará se repetindo
		// ignore case faz a comparação

		while (contador.equalsIgnoreCase("Sair")) {
			System.out.println("Digite a resposta:");
			contador = input.nextLine();
		}

		input.close();

	}

}
