package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// criando a lista usando arry
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		// Criando os usuarios
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Flavia"));
		lista.add(new Usuario("Junior"));
		lista.add(new Usuario("Gustavo"));
		
		// foreach para inserir os usuarios
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
