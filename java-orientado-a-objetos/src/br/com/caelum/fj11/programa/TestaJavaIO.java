package br.com.caelum.fj11.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {
	public static void main(String[] args) throws IOException {
		// InputStream ler bytes baseado nesse InptStream
		// FileInputStream ler caracteres baseado nesse FileInputStream
		// Baseado nesses caracteres quero criar um buffer de caracteres
		// BufferedReader
		InputStream is = new FileInputStream("leitura.txt"); //System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		OutputStream os =  new FileOutputStream("saida.txt"); // System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();
		while(linha != null){
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();
		}
//		while (linha != null) {
//			System.out.println(linha);
//			linha = br.readLine();
//		}
		bw.close();
		br.close();
	}
}
