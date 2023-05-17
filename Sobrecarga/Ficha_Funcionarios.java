package Sobrecarga;

public class Ficha_Funcionarios {
	
	private String nome;
	private int idade;
	private String profissao;
	private double salario;
	
	Ficha_Funcionarios e;
	Ficha_Funcionarios(String nome, String profissao, int idade, double salario){
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	
	Ficha_Funcionarios(int idade, double salario, String nome, String profissao){
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	
	Ficha_Funcionarios(Ficha_Funcionarios e){
		this.e = e;
		mostra_funcionarios(e);
	}
	
	public void mostra_funcionarios(Ficha_Funcionarios f) {
		System.out.println("Nome: " + f.nome + "\nIdade: " + f.idade
				+ "\nProfissao: " + f.profissao + "\nSalario: " + f.salario);
	}
	
	public String mostra_funcionarios() {
		return ("Nome: " + nome + "\nIdade: " + idade
				+ "\nProfissao: " + profissao + "\nSalario: " + salario);
	}

}
