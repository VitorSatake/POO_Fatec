package Cinemas;

public class Cinemas_Antigos extends Cinemas_de_Santos{
	private String nome_do_cinema;
	
	Cinemas_Antigos(String antigo){
		System.out.println("Historia dos cinemas de Santos\t" + antigo);
	}
	
	public void setNome(String nome_do_cinema) {
		this.nome_do_cinema = nome_do_cinema;
	}
	
	public String getNome() {
		return nome_do_cinema;
	}

}
