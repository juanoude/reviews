package br.com.alura.javaV;

public class TesteString {

	public static void main(String[] args) {

		
		String nome = "Alura"; //Object literal
		
		//String outro = new String("Alura"); // M� pr�tica
		
        nome.replace("A", "a");
        //Cada instancia da classe String � imut�vel.
        nome.toLowerCase();
        
        String outra = nome.replace("A", "a");
        //Para modific�-la deve-se criar outra instancia.
        String outra2 = nome.toLowerCase();

        System.out.println(nome);
        System.out.println(outra);
        System.out.println(outra2);
        
        char c = nome.charAt(2);
        System.out.println(c);
        
        int pos = nome.indexOf("ur");
        System.out.println(pos);
        
        String sub = nome.substring(1);
        System.out.println(sub);
        
        System.out.println(nome.length());
        
        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
        
        String vazio = "";
        System.out.println(vazio.isEmpty());
        
        String aparar ="    Al      ura    ";
        String aparado = aparar.trim(); 

        System.out.println(aparar);
        System.out.println(aparado);
        
        System.out.println(aparar.contains("Alu"));
        System.out.println(aparar.contains("ura"));
        
        
		// A classe String implementa a interface CharSequence
        //at� poder�amos declarar a vari�vel com o tipo da interface, mas isso � raro de se ver:
        CharSequence seq = "� uma sequencia de caracteres";
        
        /*
         * a classe String � especial pois gera objetos imut�veis. Isso � considerado 
         * ben�fico pensando no design mas � ruim pensando no desempenho(e por isso 
         * devemos usar aspas duplas na cria��o, pois a JVM quer contornar os problemas 
         * no desempenho com otimiza��es).
         */
        
        
        //Imagina ter que concatenar um texto enorme, concatenando muitas Strings:
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("�nibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);
        /*
         * Nesse pequeno exemplo j� criamos v�rios objetos, s� porque estamos 
         * concatenando algumas Strings. Isso � nada bom pensando no desempenho 
         * e para resolver isso existe a classe StringBuilder que ajuda na 
         * concatena��o de Strings de forma mais eficiente.
         */
        
        //Mesmo c�digo usando o string builder:
        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("�nibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String textoFinal = builder.toString();
        System.out.println(textoFinal);
        
        
        
        //StringBuilder tamb�m implementa a interface CharSequence:
        CharSequence cs = new StringBuilder("tamb�m � uma sequencia de caracteres");
        
        //Isso faz que alguns m�todos da classe String saibam trabalhar com o StringBuilder, por exemplo:
        String name = "ALURA";
        CharSequence cs2 = new StringBuilder("al");

        name = name.replace("AL", cs2);

        System.out.println(name);
        
        
        
	}

}
