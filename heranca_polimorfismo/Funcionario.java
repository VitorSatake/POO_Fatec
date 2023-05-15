package heranca_polimorfismo;

public class Funcionario extends Pessoa_Fisica{
	
private String cartao;
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getCartao() {
		return cartao;
	}
	
	public void mostraClasse() {
		System.out.println("Classe Funcionario");
	}

}
