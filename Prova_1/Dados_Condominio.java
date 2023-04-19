package Prova_1;

public class Dados_Condominio {
	
	public static void main (String args[]) {
		
		// variaveis de instancia
		
		Condominio a = new Condominio();
		
		// instancia para o quarto atributo
		
		Condominio b = new Condominio(360.00);
		
		// inserindo valores com set
		
		a.set_nome("Jardim da Flores");
		a.set_endereco("Rua A, numero 45, bairro Cidade Nova");
		a.set_quantidade(22);
		
		// retornando valores com get 
		
		System.out.println("Nome do Condominio: \t" + a.get_nome());
		System.out.println("Endereço do Condominio: \t" + a.get_endereco());
		System.out.println("Quantidade de Apartamentos: \t" + a.get_quantidade());
		// retornando valor do quarto atributo
		System.out.println("Preço do Condominio: R$ \t" + b.get_valor());
	}

}
