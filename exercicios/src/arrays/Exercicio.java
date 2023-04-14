package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		// declarando uma array(lista de alunos)
		double nota1[] = new double[6];
		
		// Adicionando notas na lista
		nota1[0] = 1.0;
		nota1[1] = 3.0;
		nota1[2] = 4.0;
		nota1[3] = 6.0;
		nota1[4] = 9.0;
		
		// array exibi todas as notas
		System.out.println(Arrays.toString(nota1));

		// o For vai exibi as notas
		for(int i = 0; i < 6; i++) {
			System.out.println(nota1);
		}	
		
		
	}
}
