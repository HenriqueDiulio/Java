package Classe;

public class equals {
	public static void main(String[] args) {
		
		// Criando Objetos usuários;
		Usuario u1 = new Usuario();
		u1.nome = "Henrique";
		u1.email = "henriquediulio3@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Henrique";
		u2.email = "henriquediulio3@gmail.com";
		
		
		/*
		 * Usar comparardo lógico e equals ele vai comparar os espaços da mémoria, para
		 * ver se é iguel. HashCode ele escolhe as possiveis alternativas que possam ser
		 * o mesmo valor.
		 */
		
		
		// COMPARANDO USANDO OPERADOR LÓGICO
			System.out.println(u1 == u2);
		
		
		/*
		 * COMPARANDO USUARIOS DEPOIS DE TER CRIADO O COMPARADOR EQUALS E TER PASSADO OS
		 * PARAMETROS CORRETOS PARA COMPARAÇÃO DE VALORES
		 */
			System.out.println(u1.equals(u2));
	}
}
