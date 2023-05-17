package Sobrecarga;

public class Acessa_Funcionarios extends Ficha_Funcionarios{
	static Ficha_Funcionarios d = new Ficha_Funcionarios("Sueli", "Professora", 32, 3876.00);
	Acessa_Funcionarios(){
		super(d);
	}
}
