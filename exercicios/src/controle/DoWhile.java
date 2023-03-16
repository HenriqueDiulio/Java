package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		// variaveis
		String texto = "";

		// Scanner
		Scanner input = new Scanner(System.in);

		// Do while é uma estrutura de controle que precisa ser executado pelo menos uma
		// vez.

		do {
			System.out.println("\nDigite as palavinhas mágicas...: ");
			texto = input.nextLine();
			
			// Deixa o contéudo da varivel em minusculo e remove os espaços
			texto = texto.toLowerCase();
			texto = texto.trim();
			
			// !texto.equalsIgnoreCase("sair") // se o texto for diferente de sair ele vai sair e printa vlw
		} while (!texto.equalsIgnoreCase("sair"));
		System.out.println("\n vlw");
		
		input.close();
	}
}
