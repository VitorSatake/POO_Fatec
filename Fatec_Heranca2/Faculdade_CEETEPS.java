package Fatec_Heranca2;

public class Faculdade_CEETEPS extends Centro_Paula_Souza {
	
	private String faculdade;
	
	public Faculdade_CEETEPS() {
		super("Santos");
	}
	
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public String getFaculdade() {
		return faculdade;
	}

}
