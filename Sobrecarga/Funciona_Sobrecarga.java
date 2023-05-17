package Sobrecarga;

import javax.swing.JOptionPane;

public class Funciona_Sobrecarga {
	
	public static void main(String args[]) {
		
		Ficha_Funcionarios funcionarios = new Ficha_Funcionarios(22, 2889.09, "Gisele", "Pedagoga");
		JOptionPane.showMessageDialog(null, funcionarios.mostra_funcionarios());
		
		concatena_aplicacao();
	}
	
	public static void concatena_aplicacao() {
		Acesso_Secundario a = new Acesso_Secundario();
	}

}
