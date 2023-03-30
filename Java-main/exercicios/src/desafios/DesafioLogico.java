package desafios;

public class DesafioLogico {

	public static void main(String[] args) {
		// declaracao de variaveis
		boolean trabalho1 = true;
		boolean trabalho2 = true;

		// comparação logica
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		
		// resultado
		System.out.println("Comprou TV 50\"" + comprouTV50);
		System.out.println("Comprou TV 32\"" + comprouTV32);
		System.out.println("Comprou sorvete ?" + comprouSorvete);
		
	}

}
