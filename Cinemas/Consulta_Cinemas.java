package Cinemas;

public class Consulta_Cinemas {
	
	public static void main(String args[]) {
		Cine_Roxy roxy = new Cine_Roxy();
		Cine_Caicara caicara = new Cine_Caicara("Antigo cinema da\n"
				+ "Av. Conselheiro Nebias - Boqueirao\n");
		Shopping_Iporanga iporanga = new Shopping_Iporanga();
		Shopping_Praia_Mar praiaMar = new Shopping_Praia_Mar();
		
		caicara.setLocalizacao("Avenida Conselheiro Nebias com a Praia.");
		caicara.setNome("Cine Caicara");
		System.out.println("Cine \t" + caicara.getNome() + " ficava na esquina da "
		+ caicara.getLocalizacao()+"\n");
		
		iporanga.setLocalizacao("Avenida Ana Costa");
		iporanga.setNome("Iporanga");
		iporanga.setCap("150");
		System.out.println("Cine \t" + iporanga.getNome() + " fica na "
		+ iporanga.getLocalizacao()+ " e sua capacidade e de " + iporanga.getCap() + " pessoas.\n");
		
		praiaMar.setLocalizacao("Rua Floriano Peixoto");
		praiaMar.setNome("Praia Mar");
		praiaMar.setCap("200");
		System.out.println("Cine \t" + praiaMar.getNome() + " fica na "
		+ praiaMar.getLocalizacao()+ " e sua capacidade e de " + praiaMar.getCap() + " pessoas.");
	}

}
