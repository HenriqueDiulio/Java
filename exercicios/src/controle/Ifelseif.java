package controle;

import javax.swing.JOptionPane;

public class Ifelseif {
	public static void main(String[] args) {

		// variaveis;
		double nota;
		String resposta = null;
		String entrada1;
		
		// Entrada de dados;
		entrada1 = JOptionPane.showInputDialog("Digite sua nota: ");
		nota = Double.parseDouble(entrada1);
		
	
		// primeiro if pega todas as notas invalidas;
		
		if(nota > 10 || nota < 0){
			System.out.println("Nota "+ nota + " invalida" + "\nDigite novamente a nota.");
		}
		else if(nota >= 0.1 || nota <= 2){
			
			System.out.println("Nota foi Muito ruim "+ nota);
			
			resposta = JOptionPane.showInputDialog("Digite se deseja pagar a taxa para refazer a prova:(S/N)");
			
			
			if(resposta.toLowerCase() == "s"){
				System.out.println("Entrem no site da insituição e escolha uma data para realizar ");
			}
			if(resposta.toLowerCase() == "n"){
				System.out.println("Infelizmente o senhor tera que repetir o semestre.");
			}
		}
		else if(nota >= 9){
			System.out.println("Nota foi Exelente "+ nota);
		}
		
		
		


	}
}
