package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		// declaração de variaveis
		int contador = 1;
		
		// while entende que, enquanto contador não for == a 10 ele vai continua repetindo o bloco que está dentro
		while(contador <= 10) {

			System.out.println("bom dia "+contador);
			
			//Sempre que repetir ele adiciona +1 a variavel contador, sendo assim ela vai repetir ate chegar a 10.
			contador++;
		}

	}

}
