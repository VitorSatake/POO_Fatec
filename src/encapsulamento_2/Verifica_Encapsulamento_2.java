package encapsulamento_2;

import encapsulamento_1.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
	
	public static void main(String args []) {
		Acesso_Numeros chave = new Acesso_Numeros();
		
		//chave.a = 10; ENCAPSULAMENTO PACKAGE PRIVATE NAO PERMITE ACESSO FORA DO PACOTE
		chave.setNumero("a", 10);
		chave.b = 20;
		//chave.c = 30; NAO E POSSIVEL ACESSAR VARIAVEL PRIVATE DIRETAMENTE
		chave.setNumero("c", 30);
		//chave.d = 40; NAO E POSSIVEL ACESSAR VARIAVEL PROTECTED DIRETAMENTE
		chave.setNumero("d", 40);
		chave.mostra_numero();
	}

}