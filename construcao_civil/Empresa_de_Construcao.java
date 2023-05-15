//POLIMORFISMO

package construcao_civil;
import javax.swing.*;

public class Empresa_de_Construcao {
	public static void main(String[] args) {
		
		Construcao pedreiro = null;
		
		int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digitar o tipo "
				+ "de construcao:"+"\n"+"1 = Casa, 2 = Apartamento ou 3 = tudo"));
		
		switch(tipo_construcao) {
		case 1:
			pedreiro = new Casa(); break;
			
		case 2:
			pedreiro = new Apartamento(); break;
			
		case 3:
			pedreiro = new Construcao(); break;
			
			default:
				System.out.println("Construcao Indefinida");
				System.exit(0);			
			
		}
		
		pedreiro.constroi();

	}

}
