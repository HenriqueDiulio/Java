package operadores;

public class Desafio_operadores_aritimeticos {

	public static void main(String[] args) {

		// função math.pow vai elevar um numero
		double a = Math.pow(6 * (3 + 2), 2);
		double c = (a / (3 * 2));

		double d = (1 - 5) * (2 - 7);
		double e = d / 2;
		double f = Math.pow(e, 2);
		
		double g = c - f;
		double h = Math.pow(g, 3);
				
		double i = Math.pow(10, 3);
		
		double j = h / i;
		
		System.out.println(j);

	}

}
