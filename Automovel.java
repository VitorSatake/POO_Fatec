package src;

public class Automovel { 

	// definiçao dos atributos 	 

	String marca; 
	String tipo; 
	String cor; 
	int ano_fabricacao; 
	double preco; 
	
	// metodos (relativos as ações relacionadas aos atributos) 
	 

	public void recebe_marca(String m) {
		marca = m;} 

	public String retorna_marca() { 
	return marca;    } 	 

	public void recebe_tipo(String t) { 
	tipo = t;    } 

	public String retorna_tipo() { 
	return tipo;    } 

	public void recebe_cor(String c) { 
	cor= c;    } 

	public String retorna_cor() { 
	return cor;    } 

	public void recebe_ano_fabricacao(int a) { 
	ano_fabricacao = a;    } 

	public int retorna_ano_fabricacao() { 
	return ano_fabricacao;    } 

	public void recebe_preco(double p) { 
	preco = p;    }  

	public double retorna_preco() { 
	return preco;    } 

	} 
