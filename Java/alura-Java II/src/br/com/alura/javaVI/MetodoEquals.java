package br.com.alura.javaVI;

import java.util.ArrayList;

import br.com.alura.javaIeII.Conta;
import br.com.alura.javaIeII.ContaCorrente;

public class MetodoEquals {
	
	public static void main(String[] args) {
		
		/*
		 * O m�todo equals � um m�todo da classe object que foi projetado para comparar
		 * equivalencia de objetos de acordo com uma regra de n�gocio;
		 * No c�digo original ele compara apenas as refer�ncias,
		 * O .contains() faz um la�o dentro de toda a lista utilizando o equals();
		 * 
		 */
		
		ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente();
        lista.add(cc);

        Conta cc2 = new ContaCorrente();
        lista.add(cc2);

        boolean existe = lista.contains(cc2);// compara as referencias, ignorando o conte�do do objeto;

        System.out.println("J� existe? " + existe);

     // o que o contains faz equivale ao seguinte loop:
        for(Conta conta : lista) {
                if (conta == cc2) {
                	System.out.println("J� tenho essa conta");
                }
        }
        
     //por�m o m�todo deveria ser de acordo com a regra de neg�cio:
//        @Override
//        public boolean equals(Object ref) {
//
//            Conta outra = (Conta) ref;
//
//            if(this.agencia != outra.agencia) {
//                return false;
//            }
//
//            if(this.numero != outra.numero) {
//                return false;
//            }
//
//            return true;
//        }
//
//	    for(Conta conta : lista) {
//          if(conta.ehIgual(cc3)) {
//              System.out.println("J� tenho essa conta!");
//          }
//      }
                    
        /*
         * Sobrescrevendo o equals o contains roda de acordo com a RN sem problemas
         * 
         */
		
	}
	
}
