package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// ao colocar <String> eu estou definindo a estrutura do tipo String
		Set<String> listaAprovados = new HashSet<String>(); // HashSet não garante a ordem dos items
		//Set<String> listaAprovados = new TreeSet<String>(); // TreeSet garante a ordem dos items
		listaAprovados.add("Olá Mundo");
		listaAprovados.add("henrique"); 
		listaAprovados.add("Ana");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro"); 
		
		System.out.println("Exibindo em lista: "+listaAprovados);
		
		// foreach vai exibir 1 a 1
		
		for(String candidatos: listaAprovados) {
			System.out.println("Cadidato: "+candidatos);
		}
		
	}
	
}
