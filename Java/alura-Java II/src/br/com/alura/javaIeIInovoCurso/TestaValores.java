package br.com.alura.javaIeIInovoCurso;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
/* Quando se faz uma atribui��o numa vari�vel de tipo 
 * primitivo, apenas se tranfere o valor respectivo, 
 * n�o declara uma dependencia cont�nua.*/

		System.out.println(segundo);
	}
}

