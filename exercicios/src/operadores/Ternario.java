package operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4.0;
		String resultado;
		
		// "?" separa a expressao dos valores que serão atribuidos ao resultado
		// ":" serapa os valores
		resultado = media >= 7 ? "Aprovado" : "Reprovado";
		String resultadoRecuperacao = media >= 5 ? "Passou" : "Reprovou na recuperacao";

		System.out.println(resultado);
		System.out.println("O aluno está " + resultadoRecuperacao);
		}
}
