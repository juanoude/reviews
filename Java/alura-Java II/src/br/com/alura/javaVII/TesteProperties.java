package br.com.alura.javaVII;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {
	public static void main(String[] args) throws IOException {
		
		/*
		 * Properties s�o arquivos de propriedade
		 * Associa o nome da configura��o com o seu valor respectivo
		 * Ex: 
		 * 	login = alura 
		 * 	senha = alurapass
		 * 	endereco = www.alura.com.br
		 * java.util.Properties � a classe especifica para trabalhar
		 * com esses key-values...
		 */
		
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		
		//Escrever os pares num arquivo:
		props.store(new FileWriter("conf.properties"), "algum coment�rio");
		
		//Ler os pares de um arquivo:
		Properties props2 = new Properties();        
		props2.load(new FileReader("conf.properties"));

		String login = props2.getProperty("login");
		String senha = props2.getProperty("senha");
		String endereco = props2.getProperty("endereco");

		System.out.println("Login: " + login + ", Senha: " + senha  + ", Endere�o: " +  endereco);
		
	}
}
