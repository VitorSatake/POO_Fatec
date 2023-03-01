// refotorando classe manipula automovel, como concessionaria para trabalhar com entrada de daods

package pooVitor;

import javax.swing.JOptionPane; // biblioteca para trabalhar com janelas de entrada de dados do usuario



public class Concessionaria {
	public static void main (String args []) {
		Automovel e = new Automovel ();
		
		String mr, md, pr, cr, ano;
		double pc,an;
		
		
		mr = JOptionPane.showInputDialog("Digite a marca: ");
		md = JOptionPane.showInputDialog("Digite o modelo: ");
		cr = JOptionPane.showInputDialog("Digite a cor: ");
		ano = JOptionPane.showInputDialog("Digite o ano: ");
		pr = JOptionPane.showInputDialog("Digite o preço: ");
		
		pc = Double.parseDouble(pr); // transforma a string passado em numero real
		an = Double.parseDouble(ano); // transforma a string passado em numero real
		
		e.marca = mr;
		e.modelo = md;
		e.cor = cr;
		e.preco = pc;
		e.ano_fabricacao = an;
		
		e.Informa_Automovel();
		
	}
}
