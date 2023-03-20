
public class Manipula_Plano {
	public static void main(String args[]) {
		
		Plano_de_Ensino a = new Plano_de_Ensino("POO", "FINALIZER", "Avaliacao Semestral", "Porgramacao Orientada a Objetos - 2");
		
		
		System.out.println("Primeiro Plano de Ensino: "+"\n");
		System.out.println("Materia: "+a.getMateria()+"\n"+
				"Conteudo: "+a.getConteudo()+"\n"+"Criterio: "+a.getCriterio()+
				"\n"+"Bibliografia: "+a.getBibliografia()+"\n");
		
Plano_de_Ensino b = new Plano_de_Ensino();
		
		
	
		b.setMateria("Engenharia");
		b.setConteudo("Devops");
		b.setCriterio("Avaliacao Semestral");
		b.setBibliografia("Padroes de Projeto");
		
		System.out.println("Segundo Plano de Ensino: "+"\n");
		System.out.println("Materia: "+b.getMateria()+"\n"+
				"Conteudo: "+b.getConteudo()+"\n"+"Criterio: "+b.getCriterio()+
				"\n"+"Bibliografia: "+b.getBibliografia()+"\n");

	}
}
