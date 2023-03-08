package controle;

import java.util.Scanner;

public class If_controler {
	public static void main(String[] args) {
		
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:".trim());
		media = sc.nextDouble();
		
		
		if(media >= 5.0 && media <= 10) {
			System.out.println(media);
			System.out.println("Parabéns, você foi aprovado!");
		}
		
		if(media >= 2.5 && media < 5.0) {
			System.out.println(media);
			System.out.println("Parabéns, você foi aprovado!");
		}
		
		if(media >= 0.0 && media < 2.5){
			System.out.println(media);
			System.out.println("Você está reprovado!");
		}
		
		sc.close();
		}
}
