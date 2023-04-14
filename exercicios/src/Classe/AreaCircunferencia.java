package Classe;

public class AreaCircunferencia {

	double raio;
	// modificador de acesso "static" // tipo da variavel "double" // variavel "pi = 3.14"
	static double pi = 3.14;
	
	// esse contrutor vai atribuir um valor a raio
	public AreaCircunferencia(double raioInicial){
		raio = raioInicial;
	}
	
	// esse metodo vai retorna o valor da soma
	double area() {
		// função math.pow vai elevar o valor de raio a 2
		return pi * Math.pow(raio, 2);
	}
	
	
}
