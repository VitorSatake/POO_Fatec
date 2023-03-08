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

// Refatorado usando set/get com entrada de dados do usuario

package Contribuinte;

import javax.swing.JOptionPane; // biblioteca para trabalhar com janelas de entrada de dados do usuario



public class Manipula_Automovel {
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
		
		e.setMarca(mr);
		e.setModelo(md);
		e.setCor(cr);
		e.setPreco(pc);
		e.setAno_Fabricacao(an);
		
		//e.Informa_Automovel();
		
			
			System.out.println("Marca do automovel: \t " + e.getMarca() + ".");
			System.out.println("Tipo do automovel: \t " + e.getModelo() + "."); 
			System.out.println("Cor do automovel: \t " + e.getCor() + ".");
			System.out.println("Ano de fabricação do automovel: \t " + e.getAno_Fabricacao() + ".");
			System.out.println("Preco do automovel: \tR$ " + e.getPreco() + "."); 
		
		
	}
}
