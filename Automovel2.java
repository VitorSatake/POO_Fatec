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

// Refatorado encapsulando usando set/get

package Contribuinte;

public class Automovel { 

	// definiçao dos atributos 	 

	private String marca; 
	private String modelo; 
	private String cor; 
	private double ano_fabricacao; 
	private double preco; 
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setAno_Fabricacao(double ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public double getAno_Fabricacao() {
		return ano_fabricacao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	/*
	public void Informa_Automovel (){
		
		System.out.println("Marca do automovel: \t " + marca + ".");
		System.out.println("Tipo do automovel: \t " + modelo + "."); 
		System.out.println("Cor do automovel: \t " + cor + ".");
		System.out.println("Ano de fabricação do automovel: \t " + ano_fabricacao + ".");
		System.out.println("Preco do automovel: \tR$ " + preco + "."); 
	}
*/
}
