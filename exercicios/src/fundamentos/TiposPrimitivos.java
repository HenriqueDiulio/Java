package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Infomações funcionario

		// Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 532;
		int id = 56789;
		long pontosAcomulados = 3_234_845_23L; // Uma variavel do tipo long utiliza a letra 'L' ou 'l' no final

		// Tipos númericos reais
		float salario = 11_445.44F; // Uma variavel do tipo float tem que utilizar a letra 'F'ou'f' no final
		double vendasAcomuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo caracter
		char status = 'A';// tem que ser declarado em aspas simples

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

		// Números de viagens
		System.out.println("Números de voos: " + numerosDeVoos / 2);

		// Pontos por real
		System.out.println("Pontos por real: " + pontosAcomulados / vendasAcomuladas);
		System.out.println(id + ":Ganha > " + salario + 
				"\nFerias:" + estaDeFerias + 
				"\nStatus: " + status);

	}
}
