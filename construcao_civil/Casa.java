//POLIMORFISMO

package construcao_civil;

public class Casa extends Construcao{
	
	Construcao casa = new Construcao();
	
	public Casa() {
		casa.setTipo("Casa");
	}
	
	public void constroi() {
		System.out.println("Faz-se "+casa.getTipo());
	}

}
