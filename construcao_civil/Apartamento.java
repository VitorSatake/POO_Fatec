//POLIMORFISMO

package construcao_civil;

public class Apartamento extends Construcao{
	
	Construcao apartamento = new Construcao();
	
	Apartamento(){
		apartamento.setTipo("Apartamento");
	}
	
	public void constroi() {
		System.out.println("Faz-se "+apartamento.getTipo());
	}

}
