package Classe;

public class ValorNulo {
	public static void main(String[] args) {
		// Foi declarado uma variavel sem valor, e depois foi concatenado o valor "oi" a
		// ela.
		String s1 = "";
		System.out.println(s1.concat("oi"));
	
		
		
		String s2 = null;
		System.out.println(s2.concat("ola"));
		
		
	}
}
