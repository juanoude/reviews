package br.com.alura.javaIIIeIV;

public class ControleBonificacao {
	private double soma;
	
	public void registra(Funcionario f) {
		this.soma += f.getBonificacao();
	}
	/*
	 *  ao criar um m�todo com o funcion�rio de par�metro, o m�todo utilizado respeitar� a heran�a, ou seja,
	 *  ao colocar um gerente de par�metro, o getBonificacao ser� do pr�prio gerente e n�o da superclasse.
	 */
}


