package Contribuinte;

public class Dados_Contribuinte {
	private String nome;
	private String CPF;
	private String CNPJ;
	private String cartao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public String getCartao() {
		return cartao;
	}
	
	public void mostra_contribuinte() {
		
		System.out.println("Nome = " + nome);
		System.out.println("CPF = " + CPF);
		System.out.println("CNPJ = " + CNPJ);
		System.out.println("Cartao = " + cartao);
 }
	
}

// Refatorado com get/set para entrada de daods de usuario chamando get no main

package Contribuinte;

public class Dados_Contribuinte {
	private String nome;
	private String CPF;
	private String CNPJ;
	private String cartao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public String getCartao() {
		return cartao;
	}
	
	/*
	public void mostra_contribuinte() {
		
		System.out.println("Nome = " + nome);
		System.out.println("CPF = " + CPF);
		System.out.println("CNPJ = " + CNPJ);
		System.out.println("Cartao = " + cartao);
	}
*/
}
	
