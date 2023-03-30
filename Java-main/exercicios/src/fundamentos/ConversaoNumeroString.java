package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 =10000;
		//tranformando int em string //length conta quantos caracteres tem na string
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
		
	}

}
