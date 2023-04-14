package Classe;

import javax.swing.JOptionPane;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia a1 = new AreaCircunferencia(5.6);
		System.out.println(a1.area());
		
		AreaCircunferencia a2 = new AreaCircunferencia(10.0);
		System.out.println(a2.area());
	}

}
