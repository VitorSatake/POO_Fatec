package heranca_polimorfismo;

public class Pessoa_Juridica extends Contribuinte{
	
private String cnpj;
	
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public void mostraClasse() {
		System.out.println("Classe Pessoa Juridica");
	}

}
