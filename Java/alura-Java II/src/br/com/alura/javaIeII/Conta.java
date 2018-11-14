package br.com.alura.javaIeII;

public abstract class Conta {
	
	protected double saldo;

	public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Voc� tentou inserir um valor negativo");
/* passe via construtor uma mensagem a ser exibida. Lembre que a String recebida como par�metro 
 * � acess�vel depois via o m�todo getMessage() herdado por todas as Exceptions.*/
        } else {
            this.saldo += valor;        
        }  
	}
	
	public boolean saca(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
		}
		
		throw new SaldoInsuficienteException(saldo);
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void showSaldo(){
		System.out.printf("O saldo �: %.2f", this.getSaldo());
	}//Mostra o saldo com duas casas decimais.
	
	public abstract void atualiza(double taxa);
}
