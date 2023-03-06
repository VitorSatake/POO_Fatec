package Contribuinte;

public class Manipula_Contribuinte {
	public static void main(String [] args) {
		Dados_Contribuinte a = new Dados_Contribuinte();
		
		//chave.a = 10; ENCAPSULAMENTO PACKAGE PRIVATE NAO PERMITE ACESSO FORA DO PACOTE
		a.setNome ("Pedro");
		a.setCPF ("123.455");
		//chave.c = 30; NAO E POSSIVEL ACESSAR VARIAVEL PRIVATE DIRETAMENTE
		a.setCNPJ("123.456.0001");
		//chave.d = 40; NAO E POSSIVEL ACESSAR VARIAVEL PROTECTED DIRETAMENTE
		a.setCartao("123.456.78");
		a.mostra_contribuinte();
	}
}
