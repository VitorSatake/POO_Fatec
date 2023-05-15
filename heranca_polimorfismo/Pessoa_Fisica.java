package heranca_polimorfismo;

public class Pessoa_Fisica extends Contribuinte{
	
private String rg;
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void mostraClasse() {
		System.out.println("Classe Pessoa Fisica");
	}
}
