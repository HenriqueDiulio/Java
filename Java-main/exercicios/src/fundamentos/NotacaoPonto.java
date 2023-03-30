package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		/**
		 * FUNÇÕES DA STRING
		 */
		String s = "Bom dia meu fi";
		
		// "replace" ele substitui caracteres ou numeros naquela determinada linha, para
		// armazenar esse novo valor vc deve declara.
		s = s.replace("fi", "pessoal ");
		System.out.println(s);

		// "toUpperCase" deixa todas as letras maiusculas naquela determinada linha,
		// para armazenar esse novo valor vc deve declara.
		s = s.toUpperCase();
		System.out.println(s);

		// "concat" Função para concatenar(adiconar) outra String, para armazenar esse
		// novo valor vc deve declara.
		s = s.concat("!!!");
		System.out.println(s);
		
		//Pode se armazena em uma variavel.
		String c = "Dev Júnior".toUpperCase();
		System.out.println(c);
		
		String b = "Bom dia Henrique".replace("Henrique", "HENRIQUE");
		System.out.println(b);
		
		//É possivel concatenar mais de uma função em uma variavel.
		String d = "Bom dia Henrique".replace("Henrique", "HENRIQUE").toUpperCase();
		System.out.println(d);
				
		//TIPOS PRIMITIVOS NAO TEM OPERADOR "."
	}

}
