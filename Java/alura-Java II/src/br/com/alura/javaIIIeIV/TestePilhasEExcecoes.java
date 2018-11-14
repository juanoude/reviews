package br.com.alura.javaIIIeIV;

public class TestePilhasEExcecoes {
	
	//Uma pilha de execu��o � onde se guarda as linhas que ainda dever�o ser executadas posteriormente. 
    public static void main(String[] args) {
    	
    	
        System.out.println("Ini do main");
        
       try {
    	   metodo1();
       }catch (ArithmeticException | NullPointerException ex){
    	   String msg = ex.getMessage();
    	   System.out.println("exception " + msg);
    	   ex.printStackTrace();
       }// Quando uma exce��o ocorre, o compilador vai removendo m�todo por m�todo at� encontrar a linha de c�digo de tratamento
        // Caso ela n�o exista a execu��o simplesmente n�o prossegue. Se existe tratamento, continua a execu��o a partir dele.
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            Funcionario c = null;
            c.getNome();
        }
        
        System.out.println("Fim do metodo2");        
    }
}
