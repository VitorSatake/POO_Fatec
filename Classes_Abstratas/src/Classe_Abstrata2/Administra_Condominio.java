package Classe_Abstrata2;

public class Administra_Condominio {
	
	public static void main(String args[]) {
		
		Condominio b = new Condominio();
		Conceito c = new Condominio();
		
		//variavel do tipo final equivale a uma constante
		final double a = 234.08;
		
		System.out.println("Nome Condominio: "+b.getNome_Condominio());
		System.out.println("Valor Condominio: R$ "+b.calcula_condominio(a));
		
		c.endereco_condominio();
	}

}
