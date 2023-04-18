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

		// vai exibir usuaio e indice 3 com os padroes da class usuario.
		System.out.println(lista.get(3));

		lista.remove(0);// para remover o usuario
		lista.remove(new Usuario("Ana")); // para remover o usuario, passando o nome
		 
		System.out.println("Tem o usuario?   "+lista.contains(new Usuario("Junior")));
		// foreach para inserir os usuarios
		for (Usuario u : lista) {
			System.out.println(u);
		}
	}
}
