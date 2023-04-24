package Fatec_Heranca2;

public class Acessa_Faculdade {
	
	public static void main(String args[]) {
		Faculdade_CEETEPS ceetps = new Faculdade_CEETEPS();
		Disciplinas_CEETEPS disciplinas = new Disciplinas_CEETEPS();
		
		ceetps.setFatec("Fatec Baixada Santista");
		ceetps.setFaculdade("ADM E ADS");
		disciplinas.setDisciplina("POO");;
		
		System.out.println("Fatec: \t" + ceetps.getFatec());
		System.out.println("Faculdade: \t" + ceetps.getFaculdade());
		System.out.println("Nome da Disciplina: \t" + disciplinas.getDisciplina());
		
	}

}
