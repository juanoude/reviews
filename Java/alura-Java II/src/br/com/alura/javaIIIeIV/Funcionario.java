package br.com.alura.javaIIIeIV;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}// Construtores n�o s�o herdados
	
	public Funcionario() {
		
	}
	
	public abstract double getBonificacao();
	// metodos abstratos s� existem em classes abstratas. Podem definir apenas a assinatura, nunca a implementa��o.
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
