package Classe_Abstrata1;

public class Aplicacao {
	
	public static void main(String args[]) {
		Classe_Abstrata a = new Classe_Filha();
		a.set_mensagem("Demosntrando Classe Abstrata.");
		a.mostra_mensagem();
	}

}
