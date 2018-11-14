package br.com.alura.javaVII;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/*
		 * A transforma��o do objeto em um fluxo bin�rio � chamada de serializa��o.
		 * A cria��o de um objeto a partir de um fluxo bin�rio de dados � chamada de deserializa��o.
		 */
		
//		String nome = "Juan Ananda";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TesteSerial1.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TesteSerial1.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		
	}
}
