package br.com.alura.javaVI;

import br.com.alura.javaIeII.*;
import java.util.ArrayList;//Deve-se importar do java util

public class TesteArrayList {
	public static void main(String[] args) {
	
		//O array list � uma classe para utilizar arrays numa linguagem mais familiar(Adapter Oficial do Java);
		ArrayList<Conta> lista = new ArrayList<Conta>();
		/*
		 *  O Generics "<>" especifica o tipo das referencias no array. Benef�cios:
		 *  C�digo mais leg�vel, j� que fica expl�cito o tipo dos elementos.
		 *  Evitar casts excessivos.
		 *  Antecipar problemas de casts no momento de compila��o.
		 */
		
        Conta cc = new ContaCorrente();
        lista.add(cc);

        Conta cc2 = new ContaCorrente();
        lista.add(cc2);
        
        System.out.println("Tamanho: " + lista.size());
        
        //Conta ref = (Conta) lista.get(0); 
        //transformar o tipo mais gen�rico em espec�fico, ou seja, necessita de type cast
        Conta ref = lista.get(0);//Por�m com o generics "<>" o cast � dispens�vel
        System.out.println(ref);
		
        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());
		
        Conta cc3 = new ContaCorrente();
        lista.add(cc3);

        Conta cc4 = new ContaCorrente();
        lista.add(cc4);
        
        
        for(int i = 0; i < lista.size(); i++) {
            Conta oRef = lista.get(i);
            System.out.println(oRef);
        }
        
        System.out.println("----------");

        for(Conta i : lista) {
            System.out.println(i);
        }
        
	}
}
