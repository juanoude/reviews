package br.com.alura.javaIIIeIV;

public class MinhaExcecao extends Exception { //checked, ou seja, � checada pelo compilador. J� RuntimeException � unchecked.

	public MinhaExcecao(String msg) {
	    super(msg);
	}
	
}
