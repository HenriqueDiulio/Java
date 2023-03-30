package controle;

public class for1 {
	public static void main(String[] args) {
		// variaveis
		int contador;
		

		// estrutura de controle for de incremtando

		for (contador = 0; contador <= 10; contador += 1) {
			System.out.println("Número é: " + contador);
		}
		
		// estrutura de controle for de numero impar
		
		System.out.println("\nNUMEROS IMPARES\n");
		
		for (contador = 1; contador <= 10; contador += 2) {
			System.out.println("Número é: " + contador);
		}
		
		// estrutura de controle for de numero par
		
		System.out.println("\nNUMEROS PARES\n");
		
		for (contador = 0; contador <= 10; contador += 2) {
			System.out.println("Número é: " + contador);
		}
		
		// FOR DE MANEIRA SIMPLIFICADA
		
		//nao iremos colocar inicialição e nem decremento depois do ";" apenas no final do bloco.
		int x = 0;
		for(; x <= 10;) {
			System.out.println("\nola mundo "+x);
			
			x+=1;
		}
		
	}
}
