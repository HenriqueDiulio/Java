package operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		// acresentando um novo valor a variavel
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		
		System.out.println(c);
		
	}

}
