package Classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {

		// Instanciando a Classe Produto e passando parametros dentro da instancia, puxando 2 objetos que são RTX 3090 E 3060
		Produto p1 = new Produto("RTX 3060",2000.0, 0.20);
		//p1.nome = "RTX 3060";
		//p1.preco = 2000.0;
		//p1.desconto = 0.20;

		var p2 = new Produto("RTX 3090 TI", 6000.0, 0.15);
		//p2.nome = "RTX 3090 TI";
		//p2.preco = 6000.0;
		//p2.desconto = 0.15;




		// Usando método para calcular o valor total do objeto.

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();


		System.out.println("\n-----------LOJINHA DO CHINA-----------" +
				"\n Produto: "+p1.nome+
				"\n Valor: "+p1.preco+
				"\n Desconto: "+p1.desconto +"%"+
				"\n Valor Final: R$"+precoFinal1
		);
		System.out.println("\n-----------LOJINHA DO CHINA-----------" +
				"\n Produto: "+p2.nome+
				"\n Valor: "+p2.preco+
				"\n Desconto: "+p2.desconto +"%"+
				"\n Valor Final: R$"+precoFinal2
		);



	}
}