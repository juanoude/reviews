package br.com.alura.javaIeII;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando Tribut�vel : " + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}
}
