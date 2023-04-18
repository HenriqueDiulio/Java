package colecoes;

import java.util.Objects;

public class Usuario {

	String nome;

	// contrutor usuario
	Usuario(String nome) {
		this.nome = nome;
	}

	/* VALIDACAO DE DADOS COM HashCode & Equals */
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	/*
	 * No momento que tenta imprimir um objeto do tipo usuario vai ser exibido
	 * seguindo os padroes do toString
	 */

	public String toString() {
		return "Meu nome é " + nome + ".";
	}
}
