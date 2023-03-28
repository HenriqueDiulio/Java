package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		// para intaciar um classe:
		// Tipo -> Nome -> = new(que e um palavra reeservada para chamar um contrutor)
		// -> Nome da classe
		Produto p1 = new Produto();

		// alterando valores das variaveis da instância(classe produto)
		p1.nome = "Acer Nitro 5";
		p1.preco = 5000.0;
		p1.desconto = 0.10;

		Produto p2 = new Produto();

		p2.nome = "Caneta";
		p2.preco = 2.0;
		p2.desconto = 0.1;

		System.out.println("----------- CARRINHO DE COMPRA -----------"
				+p1.nome + p2.nome);

		double valortotal1 = p1.precoComDesconto(p1.preco, p1.desconto);
		double valortotal2 = p2.precoComDesconto(p2.preco, p2.desconto);

		System.out.println("----------- TOTAL -----------\n"
				+ "O valor de "+ p1.nome+ " é de: "+valortotal1 
				+"\nO valor de "+ p2.nome+ " é de: "+valortotal2);
	}
}
