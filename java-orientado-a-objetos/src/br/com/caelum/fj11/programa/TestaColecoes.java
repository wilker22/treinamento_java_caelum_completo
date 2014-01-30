package br.com.caelum.fj11.programa;

import java.util.ArrayList;
import java.util.Collections;

import br.com.caelum.fj11.modelo.Conta;

public class TestaColecoes {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); // dessa maneira nosso arrayList aceita qualquer tipo de Object
		ArrayList<String> nomes = new ArrayList<String>(); // Somente tipo string
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));
		
		for(int i = 0; i < nomes.size(); i++ ){
			System.out.println(nomes.get(i));
		}
		
		Collections.sort(nomes);
		System.out.println("Ordendo agora...");
		
		for(String ordena : nomes) {
			System.out.println(ordena);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(1500.0);
		c2.deposita(550.0);
		
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.get(1));
		
		System.out.println("ordenando as contas");
		Collections.sort(contas);
		for(Conta c : contas) {
			System.out.println(c);
		}
	}
}
