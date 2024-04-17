package Classe;

public class Produto {
	String nome;
	double preco;
	double desconto;

	/*Construtor > Ao criar com um construtor explicito, o atributo vai ser passado dentro da instancia do objeto.
	 *Para que Seja ativo o construtor padrão é necessario cria outro construtor dentro da Classe produto
	 *sem passar nenhum argumento, para que assim o java entenda que o construtor padrão está sendo
	 *ativo nomanete.;
	 *Ex:
	 *
	 *   Produto(){
	 *
	 *   }
	 */
	Produto(String nomeInical, double precoInical, double descontoInicial ){
		nome = nomeInical;
		preco = precoInical;
		desconto = descontoInicial;

	}


    /* Metodo que calcula o preço final

    - double precoComDesconto: É o tipo de resultado que o metodo somar vai retornar.

    - Dentro do metodo precoComDesconto, temos dois parametro double preco e double desconto, serão parametros que entraram no metodo
    assim que forem chamados.

    - Um método pode ter receber quantos parametros o desenvolvedor achar necessario e para retorno
    da mesma forma.

    - OBS: Em uma Classe pode exitir mais de um método com o mesmo nome, porém não pode ter a mesma quantidade de parametros
    de entrada!

    - OBS: Não foi adicionado parametro dentro do (), ex (double preco, double desconto, pois o atributos usados no método estão
    na mesma classe, caso estivesse em outra teria que puxar e desclarar.
    */

	double precoComDesconto() {
		double resultado = preco * ( 1 - desconto);

		return resultado;
	}
}