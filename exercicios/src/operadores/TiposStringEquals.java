package operadores;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {

		// PARA COMPARACAO DE STRINGS USE O EQUALS

		System.out.println("Henrique" == "HENRIQUE");

		// Declarando uma String e comparando porem vai da false pois as duas sao
		// diferentes
		String s = new String("Henrique");

		System.out.println("Henrique" == s);

		// o equals vai comparar os conteúdos das Strings
		System.out.println("Henrique".equals(s));

		Scanner sc = new Scanner(System.in);

		String s1;

		System.out.println("Digite seu nome:");
		s1 = sc.nextLine();

		// Fazendo a comparação da String.
		// O "Trim" e usado para remover os espaços existentes caso o usuario tenha
		// colocado.
		System.out.println("A String é igual?: " + s.equals(s1.trim()));

		sc.close();
	}
}
