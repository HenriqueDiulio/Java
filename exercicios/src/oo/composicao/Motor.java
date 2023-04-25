package oo.composicao;

public class Motor {
	
	// variaveis
	boolean ligado = false; // motor esta desligado;
	double fatorInjeção = 1; 
	
	int giros() {
		// se o motor estiver ligado ele cai no segundo bloco
		if(!ligado) {
			return 0;
		}else {			
			return (int) (fatorInjeção * 3000.0);				
		}
	}

}