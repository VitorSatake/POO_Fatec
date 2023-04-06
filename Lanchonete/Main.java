package Lanchonete;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		System.out.println("Selecione seu combo: ");
		System.out.println("1. Combo Master");
		System.out.println("2. Super Combo");
		System.out.println("Sua escolha: ");
		
		Scanner input = new Scanner(System.in);
		
		int tipo = input.nextInt();
		
		Combo combo = new Combo();
		combo.CriarCombo(tipo);
		combo.Mostra(tipo);
		
		
	}
}
