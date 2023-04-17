package Classe;

public class Usuario {
	
	String nome;
	String email;
	
	
	// COMPARAÇÃO ENTRE VALORES DA VARIAVEL
	public boolean equals(Object objeto) {
	
		Usuario user = (Usuario) objeto;
		
		boolean VerificaNome = user.nome.equals(this.nome);
		boolean VerificaEmail = user.email.equals(this.email);
		
		return VerificaNome && VerificaEmail;
	}
}
