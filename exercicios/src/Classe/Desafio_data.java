package Classe;

public class Desafio_data {
	// declarando variaveis
	int dia, mes, ano;

	public Desafio_data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	// metodo para formatar a data
	public String Formatacao() {
		return String.format(dia +" "+ mes +" "+ ano);	
	}
	// metodo para exibir a formatação
	void Mostrar() {
		
	}
}
