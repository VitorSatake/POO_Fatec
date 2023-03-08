package Contribuinte;

public class Manipula_Contribuinte {
	public static void main(String [] args) {
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		//chave.a = 10; ENCAPSULAMENTO PACKAGE PRIVATE NAO PERMITE ACESSO FORA DO PACOTE
		a.setNome ("Pedro");
		a.setCPF ("123.455");
		//chave.c = 30; NAO E POSSIVEL ACESSAR VARIAVEL PRIVATE DIRETAMENTE
		a.setCNPJ("123.456.0001");
		//chave.d = 40; NAO E POSSIVEL ACESSAR VARIAVEL PROTECTED DIRETAMENTE
		a.setCartao("123.456.78");
		a.mostra_contribuinte();
	}
}

// Refatorado para entrada de dados do usuário

package Contribuinte;

import javax.swing.JOptionPane;

public class Manipula_Contribuinte {
	public static void main(String [] args) {
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		String nm, cp, cnp, car;
		//double cp2,cnp2, car2;
		
		
		nm = JOptionPane.showInputDialog("Digite o nome: ");
		cp = JOptionPane.showInputDialog("Digite o CPF: ");
		cnp = JOptionPane.showInputDialog("Digite o CNPJ: ");
		car = JOptionPane.showInputDialog("Digite o número do cartão: ");
		
		//cp2 = Double.parseDouble(cp);
		//cnp2 = Double.parseDouble(cnp);
		//car2 = Double.parseDouble(car);
		
		a.setNome(nm);
		a.setCPF(cp);
		a.setCNPJ(cnp);
		a.setCartao(car);
		
		a.mostra_contribuinte();

}
}
