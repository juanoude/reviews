package br.com.alura.javaVII;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("escritateste.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando escrita, isso � o come�o de um grande conhecedor de programa��o");
		bw.newLine();// "Enter"
		bw.write("Serei um pr�spero desenvolvedor FullStack, concursado e especialista na �rea de dados.");
				
		bw.close();
	}
}
