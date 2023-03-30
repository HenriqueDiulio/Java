package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// Qual a letra na 2 casa
		System.out.println("Óla pessoal".charAt(2));

		String s = "Boa Tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		
		// startsWith verifica a String passada, se for == ele retorta true se for =!
		// ele retorna false
		System.out.println(s.startsWith("Boa"));
		
		// endsWith verifica a String passada termina com o valor igual, te retorna um
		// valor boolean
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		// equals verifica se a String e ==
		System.out.println(s.equals("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		double idade = 18;
		var salario = 12345.987;
		System.out.println("____________________________________________________" +"\nNome: " + nome +
				"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade +
				"\nSalario: " + salario);
		
	}
}
