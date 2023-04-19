package Prova_1;

public class Condominio {
	//atributos
	
	private String nome_condominio;
	private String endereco_condominio;
	private int quantidade_apartamentos;
	private double valor_condominio;  // quarto atributo
	
	Condominio (){}  // novo método construtor
	
	Condominio (double valor_condominio){
		this.valor_condominio = valor_condominio;
	}
	
	// metodos set
	
	public void set_nome(String nome_condominio) {
		this.nome_condominio = nome_condominio;
	}
	
	public void set_endereco(String endereco_condominio) {
		this.endereco_condominio = endereco_condominio;
	}
	
	public void set_quantidade(int quantidade_apartamentos) {
		this.quantidade_apartamentos = quantidade_apartamentos;
	}
	
	// metodos get
	
	public String get_nome() {
		return nome_condominio;
	}
	
	public String get_endereco() {
		return endereco_condominio;
	}
	
	public int get_quantidade() {
		return quantidade_apartamentos;
	}
	
	// metodo p/ retornar o quarto atributo
	
	public double get_valor() {
		return valor_condominio;
	}

}








