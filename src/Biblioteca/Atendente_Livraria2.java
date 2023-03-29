package Biblioteca;
import javax.swing.JOptionPane;

public class Atendente_Livraria2 {
public static void main(String args[]) {
		
		Livraria2 cultura = new Livraria2();
		
		String cd, ed, au, li, qt, pr;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria - \n Digite:\n 1 para Romance \n 2 para Espirita \n 3 para Informática");
		cd = JOptionPane.showInputDialog(null, "Codigo");
		ed = JOptionPane.showInputDialog(null, "Editora");
		au = JOptionPane.showInputDialog(null, "Autor");
		li = JOptionPane.showInputDialog(null, "Livro");
		qt = JOptionPane.showInputDialog(null, "Quantidade");
		pr = JOptionPane.showInputDialog(null, "Preço");
		
		f = Integer.parseInt(cd);
		g = Integer.parseInt(qt);
		h = Double.parseDouble(pr);
		
		cultura.setEditora(ed);
		cultura.setAutor(au);
		cultura.setLivro(li);
		cultura.setQuantidade(g);
		cultura.setPreco(h);
		
//		cultura.Informa_Livros(f);
//}

//public static void Informa_Livros(int f) {

	switch(f) {
	
	case 1: JOptionPane.showMessageDialog(null, "Categoria Romance \n" + 
	"Livro: " + cultura.getLivro() +
	"\n Editora: " + cultura.getEditora() +
	"\n Autor: " + cultura.getAutor() +
	"\n Quantidade: " + cultura.getQuantidade() +
	"\n Preço: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
	
	case 2: JOptionPane.showMessageDialog(null, "Categoria Espirita \n" + 
			"Livro: " + cultura.getLivro() +
			"\n Editora: " + cultura.getEditora() +
			"\n Autor: " + cultura.getAutor() +
			"\n Quantidade: " + cultura.getQuantidade() +
			"\n Preço: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
			
	case 3: JOptionPane.showMessageDialog(null, "Categoria Informatica \n" + 
			"Livro: " + cultura.getLivro() +
			"\n Editora: " + cultura.getEditora() +
			"\n Autor: " + cultura.getAutor() +
			"\n Quantidade: " + cultura.getQuantidade() +
			"\n Preço: " + cultura.getPreco(), "", JOptionPane.PLAIN_MESSAGE); break;
			
	default: System.out.println("Codigo não responde a nenhuma categoria de livro!");
	}
}
}

