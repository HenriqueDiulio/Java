package controle;

public class Continue {
	public static void main(String[] args) {
		
		for (int x = 0; x > 10; x ++) {
			// X tem resto 2? entra no if
			if(x % 2== 1) {
				System.out.println("O numero é:"+x);
				continue;
			}
			System.out.println(x);
		}
	}
}
