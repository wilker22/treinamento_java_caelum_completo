package br.com.caelum.fj11.programa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaJavaIO1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida.txt");
		
		while(sc.hasNextLine()){
			String liha = sc.nextLine();
			ps.println(liha);
		}
		ps.close();
		sc.close();
	}
}
