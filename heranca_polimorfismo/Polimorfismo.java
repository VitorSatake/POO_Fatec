package heranca_polimorfismo;

import javax.swing.*;

public class Polimorfismo {
	public static void main(String[] args) {
		
		Contribuinte pessoa = null;
		
		int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digitar a opcao "
				+ "valor numerico entre 1 e 4"));
		
		switch(tipo_construcao) {
		case 1:
			pessoa = new Contribuinte(); break;
			
		case 2:
			pessoa = new Pessoa_Fisica(); break;
			
		case 3:
			pessoa = new Pessoa_Juridica(); break;
			
		case 4:
			pessoa = new Funcionario(); break;
			
			default:
				System.out.println("Tipo nao pertence a familia");
				System.exit(0);			
			
		}
		
		pessoa.mostraClasse();

	}

}

