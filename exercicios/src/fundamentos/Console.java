package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// print ele vai executar uma linha e vai permanecer nela.

		System.out.print("Bom");
		System.out.print("Dia");
		// PrintLN vai executar uma linha e vai pular para a próxima.
		System.out.println("BOM DIA");

		System.out.printf("Números da MegaSena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalario: %.1f", 12345.678);

		// ***ENTRADA DE DADOS***
		// O SCANNER recebe informacoes
		// Ao declarar um scanner vc deve utilizar (System.in) que significa entrada de
		// dados
		String nome, sobrenome;
		int idade;

		Scanner sc = new Scanner(System.in);

		System.out.print("\n=======================================" + "\nDigite seu nome: ");
		nome = sc.nextLine();

		System.out.print("\nDigite seu sobrenome: ");
		sobrenome = sc.nextLine();

		System.out.print("\nDigite sua idade: ");
		idade = sc.nextInt();

		System.out.print("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);

		sc.close();

	}

}
