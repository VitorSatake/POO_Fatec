// refatorando classe Automovel com entrada de dados do usuario


package pooVitor;

public class Automovel { 

	// definiçao dos atributos 	 

	String marca; 
	String modelo; 
	String cor; 
	double ano_fabricacao; 
	double preco; 
	
	public void Informa_Automovel (){
		
		System.out.println("Marca do automovel: \t " + marca + ".");
		System.out.println("Tipo do automovel: \t " + modelo + "."); 
		System.out.println("Cor do automovel: \t " + cor + ".");
		System.out.println("Ano de fabricação do automovel: \t " + ano_fabricacao + ".");
		System.out.println("Preco do automovel: \tR$ " + preco + "."); 
	}

}
