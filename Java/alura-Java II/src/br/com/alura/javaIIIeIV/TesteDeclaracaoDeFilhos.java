package br.com.alura.javaIIIeIV;

public class TesteDeclaracaoDeFilhos {

	public static void main(String[] args) {
		// Quando se declara assim, n�o funciona pois nem todo funcion�rio � um gerente.
		Gerente g1 = new Funcionario();

		// J� o contr�rio funciona, por�m existe uma peculiaridade:
		Funcionario g1 = new Gerente();
		// Se ao declarar tal instancia eu fizer:
		g1.setSenha(2222);
        g1.autentica(2222);
        // N�o funcionar� porque a referencia � Funcionario, assim, o compilador encara ele como se fosse o pr�prio...
        
        /*
         *  Isso tamb�m � chamado de polimorfismo, pois s�o duas formas diferentes de se chegar a um mesmo objeto Gerente.
         */
	}

}
