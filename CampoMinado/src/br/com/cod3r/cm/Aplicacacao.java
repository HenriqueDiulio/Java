package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 2, 6);			
		new TabuleiroConsole(tabuleiro);
	}
}
