package br.com.alura.javaVI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.javaIIIeIV.Funcionario;
import br.com.alura.javaIIIeIV.Gerente;
import br.com.alura.javaIeII.Conta;
import br.com.alura.javaIeII.ContaCorrente;
import br.com.alura.javaIeII.ContaPoupanca;

public class TesteOrdena��odeListas {	
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente();
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca();
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente();
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca();
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
		System.out.println("----------------------------");
		ComparadorDeSaldo comparador = new ComparadorDeSaldo();
		lista.sort(comparador);
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
		System.out.println("----------------------------");
		
		Funcionario f1 = new Gerente();
		f1.setNome("Jimizim");

		Funcionario f2 = new Gerente();
		f2.setNome("Anildo");

		Funcionario f3 = new Gerente();
		f3.setNome("Jovilson");

		Funcionario f4 = new Gerente();
		f4.setNome("Raikag�o");

		List<Funcionario> lista2 = new ArrayList<>();
		lista2.add(f1);
		lista2.add(f2);
		lista2.add(f3);
		lista2.add(f4);
		
		for(Funcionario funcionario: lista2) {
			System.out.println(funcionario.getNome());
		}
		
		System.out.println("----------------------------");
		
//		ComparadorDeString comparador2 = new ComparadorDeString();
//		lista2.sort(comparador2);
//		Forma mais enxuta:
		lista2.sort(new ComparadorDeString()); // j� que o usamos apenas dentro do sort...
		/*
		 *  sort foi adicionado no java 1.8, antigamente se usava a classe Collections que possui v�rios m�todos est�ticos
		 *  Collections.reverse(lista); - Inverte a ordem da lista
		 *  Collections.shuffle(lista); - Embaralha
		 *  Collections.rotate(lista, 5); - Rotaciona 5 posicoes
		 *  Collections.sort(lista, comparador); - sorteia com crit�rio
		 */
		
		
		for(Funcionario funcionario: lista2) {
			System.out.println(funcionario.getNome());
		}
		
	}
}

		/*
		 * O sort � uma reordena��o da ordem natural da lista,
		 * para definir essa regra prim�ria se faz o seguinte:
		 *  - Implementa a interface Comparable(java.lang) na Classe(Funcionario/Conta)
		 *  - Define o m�todo compareTo, que recebe um argumento,
		 *  portanto se compara o this com o argumento.
		 *  - Chama o lista.sort(null)- cheiro de m� pr�tica.
		 */

class ComparadorDeSaldo implements Comparator<Conta> {
// A interface comparator serve como criterio de ordena��o no sort();
	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getSaldo() > c2.getSaldo()) {
			return 1;
		}else if (c1.getSaldo() < c2.getSaldo()) {
			return -1;
		}else {
		return 0;
		}
		 
		/*
		 * Forma mais enxuta:
		 * return c1.getSaldo - c2.getSaldo;
		 * Subtraindo j� h� uma compara��o, retorna positivo se o primeiro for maior e etc...
		 * ---------------------------------------------------------------------------------------------
		 * Forma ainda mais elegante:
		 * return Integer.compare(c1.getSaldo(), c2.getSaldo());
		 */
	}
}

class ComparadorDeString implements Comparator<Funcionario>{

	//Strings j� possuem um m�todo de compara��o pr�-definido, basta coloc�-lo no return;
	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		String nome1 = f1.getNome();
		String nome2 = f2.getNome();
		
		return nome1.compareTo(nome2);
	}
	
}