
public class Automovel {
	
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	//método construtor
	Automovel () {}
	
	//método construtor
	Automovel(int ano, String marca, String modelo, double preco) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}
	
	public void mostra_carro() {
		System.out.println("\n"+"Marca do carro: "+marca +"\n"+
				"Modelo do carro: "+modelo+"\n"+"Ano do carro: "+ano+
				"\n"+"Cor do carro: "+cor+"\n"+"Preço do carro: "+preco);
	}
}
