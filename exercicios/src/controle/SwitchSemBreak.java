package controle;

import javax.swing.JOptionPane;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String login;
		
		// entrada de dados
		login = JOptionPane.showInputDialog("Digite seu login");
		login = login.toLowerCase().trim();
	
		// ele vai testa a variavel com todas as case's, se for igual a uma ela vai executar o bloco
		
		switch (login) {
		
		case"henrique":
			JOptionPane.showMessageDialog(null,"Bem vindo Henrique");
		case"paulo":
			JOptionPane.showMessageDialog(null,"Bem vindo paulo");
		case"firmino":
			JOptionPane.showMessageDialog(null,"Bem vindo firmino");
		default:
			JOptionPane.showMessageDialog(null, "login invalido... ");
		}
		
		}
	}

