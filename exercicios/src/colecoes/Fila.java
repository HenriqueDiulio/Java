package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Sara_Pele");
		fila.add("Gui_lokon");
		fila.add("Zeus");
		fila.add("Gilson");
		fila.add("Haya_Pele");
		fila.add("Joao_Mobile");
		fila.add("DK");
		
		// ele retorna true quando tem espaço na fila
		System.out.println(fila.offer("bia"));
		
		System.out.println(fila);
	}
}
