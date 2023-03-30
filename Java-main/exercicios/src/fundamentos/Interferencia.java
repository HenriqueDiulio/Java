package fundamentos;

public class Interferencia {

	public static void main(String[] args) {

		// Java vai intender que essa variavel e do tipo double, por conta do valor que
		// foi atribuido a ela;
		double a = 4.5;
		System.out.println(a);

		// Java vai intender que essa variavel e do tipo double, por conta do valor que
		// foi atribuido a ela;
		var b = 5.5;
		System.out.println(b);

		// Java vai intender que essa variavel e do tipo String, por conta do valor que
		// foi atribuido a ela;
		var c = "Texto";
		System.out.println(c);

		c = "Outro Texto";
		System.out.println(c);

		double d;
		d = 1000.0;
		System.out.println(d);
	}

}
