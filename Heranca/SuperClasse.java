package Heranca;

public class SuperClasse {
	
	private String atributo_1;
	
	SuperClasse() {
		System.out.println("Acesso ao método construtor de SuperClasse");
	}
	
	public void set_atributo_1(String atributo_1) {
		this.atributo_1 = atributo_1;
	}
	
	public String get_atributo_1() {
		return atributo_1;
	}
}
