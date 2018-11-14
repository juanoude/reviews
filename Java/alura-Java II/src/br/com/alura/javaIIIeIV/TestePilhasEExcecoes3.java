package br.com.alura.javaIIIeIV;

public class TestePilhasEExcecoes3 {
	
	public static void main(String[] args) {
    	
    	
	    //� poss�vel fabricar exce��es, criando um objeto e lan�ando-o.
	        System.out.println("Ini do main");
	        
	       try {
	    	   metodo1();
	       }catch (ArithmeticException | NullPointerException | MinhaExcecao ex){
	    	   //Ao inves do pipe pode-se chamar Exception, a qual � m�e de todas outras.
	    	   String msg = ex.getMessage();
	    	   System.out.println("exception " + msg);
	    	   ex.printStackTrace();
	       }
	        
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() throws MinhaExcecao{
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() throws MinhaExcecao {
	        System.out.println("Ini do metodo2");
	     
	        throw new MinhaExcecao("deu merda");       
	        
	        //System.out.println("Fim do metodo2");        
	    }
	    
}
