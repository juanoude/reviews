package br.com.alura.javaV;
	/**
	 * O coment�rio de dois asteriscos � o comentario voltado a outra equipe de desenvolvimento,
	 * ao utiliz�-lo em cima de qualquer elemento public...
	 * H� a aba javadoc para visualizar-los de forma mais estruturada e
	 * em "Project -> Generate Javadoc" cria-se uma p�gina html documental do projeto.
	 * @author juano_000
	 *
	 */

public class Pacotes {
	
	/*
	 * FQN = Full Qualifyed Name = nome-do-pacote.nome-da-classe
	 * Pacotes organizam o c�digo atrav�s dos nomes �nicos de seus dom�nios respectivos
	 * Pode-se importar todos arquivos atrav�s do "*", por�m importar cada classe resulta em um c�digo mais legiv�l, explicito e
	 * esclarecedor (conven��o/boa pr�tica) <<Ctrl + Shift + O>>.
	 * O modificador de acesso default tamb�m � denominado package private.
	 */
	
	/**
	 * Descri��o documental aqui...
	 * @param msg
	 */
	public void testeDocs(String msg){
		System.out.println("Testando o javadoc : " + msg);
	}
}
