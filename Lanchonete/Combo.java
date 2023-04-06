package Lanchonete;

public class Combo {
	
	private Burguer burguer = new Burguer();
	private Bebida bebida = new Bebida();
	private Sobremesa sobremesa = new Sobremesa();
	
	
	
	public void CriarCombo(int tipo) {
		
		
		int tipo1 = 0;
		
		switch(tipo1) {
		
		case 1: System.out.println("Combo 1: ");
		burguer.EscolherBurguer();
		bebida.PedirBebida();
		sobremesa.PedirSobremesa();
		
		case 2: System.out.println("Combo 2: ");
		burguer.EscolherBurguer();
		bebida.PedirBebida();
		sobremesa.PedirSobremesa();
		
	
	}
}
	
	public void Mostra(int tipo) {
		if(tipo == 1) {
			System.out.println("Burguer 300 gramas, Sobremesa pequena e Bebida 500 ML.");
		}
		else {
			System.out.println("Burguer 200 gramas, Sobremesa grande e Bebida 300 ML.");
		}
		
	}
	
}







