package controle;

public class for3 {

	public static void main(String[] args) {

		// a variavel que eu daclarei dentro do for vai ter validade somente lá;
		
		for (int contador = 0; contador <= 10; contador += 1) {
			System.out.println("contador é: " + contador);
		}
		// Podemos declara a variavel " i " fora do for que ela vai ser valida
		int contador = 100;

		System.out.println("FORA DO LAÇO FOR CONTADOR VALE = "+contador);

	}
}
