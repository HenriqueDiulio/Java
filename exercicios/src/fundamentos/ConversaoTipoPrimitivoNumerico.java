package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// conversao implicita(automatica) de int "1" para double"1.0"
		double a =1;
		System.out.println(a);
		
		//conversao explicita, pois eu to apontando a conversao
		float b = (float)1.0;
		System.out.println(b);
		
		
		int c = 1000000;
		byte d =(byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int)e;
		System.out.println(f);
		
		
	}

}
