package Fatec_Heranca2;

public class Centro_Paula_Souza {
	
	private String Fatec;
	private String cidade;
	
	public Centro_Paula_Souza(String cidade) {
		this.cidade = cidade;
		System.out.println("Método construtor da superclasse \n" + "Cidade: " + cidade);
		
	}
	
	public void setFatec(String Fatec) {
		this.Fatec = Fatec;
	}
	
	public String getFatec() {
		return Fatec;
	}

}
