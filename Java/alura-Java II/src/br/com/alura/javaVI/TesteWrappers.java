package br.com.alura.javaVI;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		/*
		 * java.lang.Numbers � pai de todos os doubles e inteiros:
		 * double - 8 bytes;
		 * float - 4 bytes;
		 * long - 8 bytes;
		 * int - 4 bytes;
		 * short - 2 bytes;
		 * byte - 1 bytes;
		 * ====================================
		 * char - 2 bytes
		 * ====================================
		 * boolean - 2 bytes
		 * 
		 * Todas s�o java.lang
		 * ====================================
		 * A exist�ncia de primitivos e wrappers � explicada pelo momento da cria��o do Java, 
		 * � �poca, a capacidade de processamento das m�quinas era limitado, e a mem�ria era 
		 * custosa, portanto, pensando em quest�es de desempenho, e mem�ria, importante a 
		 * exist�ncia dos primitivos. Eles s�o mais r�pidos, e ocupam menos espa�o.
		 * Hoje, isso n�o � mais um problema, sua exist�ncia se justifica apenas 
		 * historicamente, como um legado.
		 */
		
		//os TP's tamb�m s�o classes:
		
		Integer iNum = Integer.valueOf(24); //autoboxing
		System.out.println(iNum.intValue()); //unboxing
		
		Boolean iBoo = Boolean.FALSE; //autoboxing
		System.out.println(iBoo.booleanValue()); //unboxing
		
		Double iDou = Double.valueOf(24); //autoboxing
		System.out.println(iDou.doubleValue()); //unboxing
		
		Integer iRef = new Integer(29);// forma obsoleta de autoboxing
		
		Integer iNum2 = 25; // Forma enxuta com unboxing impl�cito
		
		//------------------------------------------------------
		
		int[] idades = new int[5]; //Array de tipos primitivos.
		
		String[] nomes = new String[5]; // Array de referencias.
		
		
		//Listas por sua vez, aceitam apenas referencias a objetos tamb�m.
		int idade = 29;
        List numeros = new ArrayList();
        numeros.add(idade);/* essa linha s� compila porque o compilador faz um autoboxing impl�cito.
        ou seja, faz isso : coloca o tipo primitivo no wrapper
        respectivo, s�o classes que embrulham tipos primitivos.
        O autoboxing tamb�m aceita strings e faz o parsing implicitamente*/
		
        
        //-------------------------------------------------------------------------
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
	}

}
