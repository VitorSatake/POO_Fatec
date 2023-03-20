
public class Plano_de_Ensino {
	private String materia;
	private String conteudo;
	private String criterio;
	private String bibliografia;
	
	Plano_de_Ensino(){};
	
	Plano_de_Ensino(String materia, String conteudo, String criterio, String bibliografia){
		this.materia = materia;
		this.conteudo = conteudo;
		this.criterio = criterio;
		this.bibliografia = bibliografia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public String getCriterio() {
		return criterio;
	}
	
	public String getBibliografia() {
		return bibliografia;
	}
	

	
}
