package br.com.alura.javaIIIeIV;

public class ExemploPraticoCatch {
	public static void main(String[] args) {
		
		//Apenas um exemplo pois n�o quis criar a respectiva classe
		
		public void saca(double valor) throws SaldoInsuficienteException{

	        if(this.saldo < valor) {
	            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
	        } 

	        this.saldo -= valor;       
	        
		}
	
	   public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	            this.saca(valor); 
	            /*
	             * Como o m�todo j� tem um exception que interrompe a execu��o em caso de erro
	             * N�o � necess�rio uma estrutura de decis�o extra nesse m�todo.
	             */
	            destino.deposita(valor);
	   }

	}
	
}