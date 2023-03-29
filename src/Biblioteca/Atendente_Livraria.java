package Biblioteca;
import javax.swing.JOptionPane;

public class Atendente_Livraria {
	
	public static void main(String args[]) {
		
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria - \n Digite:\n 1 para Romance \n 2 para Espirita \n 3 para Informática");
		a = JOptionPane.showInputDialog(null, "Codigo");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "Quantidade");
		i = JOptionPane.showInputDialog(null, "Preço");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.quantidade = g;
		cultura.preco = h;
		
		cultura.Informa_Livros(f);
		
	}
}
