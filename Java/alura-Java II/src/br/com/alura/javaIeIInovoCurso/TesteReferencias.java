package br.com.alura.javaIeIInovoCurso;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta " + segundaConta.saldo);

		System.out.println(primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma conta");
		}
//O que � passado como valor � o endere�o do objeto, portanto torna as duas ponteiros para o mesmo lugar.
	}
}