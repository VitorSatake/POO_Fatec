package Heranca_3;

import javax.swing.JOptionPane;

public class UsaFuncionario {
	
	public static void main (String args[]){
		
		Funcionario funcionario = new Funcionario();
		PessoaJuridica PJ = new PessoaJuridica();
		
		String u, v, t, z;
		int x;
		
		z = JOptionPane.showInputDialog("Digite 1"
				+ " se contribuinte é pessoa fisica \n "
				+ "Digite 2 se é pessoa juridica");
		
		x = Integer.parseInt(z);
		if (z.length() == 1) {
			switch (x) {
			
			case 1: {
				u = JOptionPane.showInputDialog("Escrever"
						+ " o nome do contribuinte");
				v = JOptionPane.showInputDialog("Escrever"
						+ " o RG do contribuinte"); 
				t = JOptionPane.showInputDialog("Escrever"
						+ " a identificacao do cartao do contribuinte");
				
				funcionario.setNome(u);
				funcionario.setRg(v);
				funcionario.setCartao(t);
				
				System.out.println("Nome: "+funcionario.getNome());
				System.out.println("RG: "+funcionario.getRg());
				System.out.println("Cartao: "+funcionario.getCartao());
				break;
			}
			
			case 2: {
				u = JOptionPane.showInputDialog("Escrever"
						+ " o nome do contribuinte");
				v = JOptionPane.showInputDialog("Escrever"
						+ " o CNPJ do contribuinte"); 
				t = JOptionPane.showInputDialog("Escrever"
						+ " a identificacao do cartao do contribuinte");
				
				funcionario.setNome(u);
				PJ.setCnpj(v);
				funcionario.setCartao(t);
				
				System.out.println("Nome: "+funcionario.getNome());
				System.out.println("CNPJ: "+PJ.getCnpj());
				System.out.println("Cartao: "+funcionario.getCartao());
				break;
			
			}
		}
		
	}

}
}
