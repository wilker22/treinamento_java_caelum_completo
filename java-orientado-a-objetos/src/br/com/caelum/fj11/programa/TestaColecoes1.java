package br.com.caelum.fj11.programa;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import br.com.caelum.fj11.modelo.Conta;

public class TestaColecoes1 {
	public static void main(String[] args) {
		
		// Permite add mesmo grupo repetidas vezes
		List<String> nomes = new LinkedList<String>();
		nomes.add("Astesio Jose");
		nomes.add("Josoé");
		nomes.add("Astesio Jose");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(2));
		
		Set<String> nomesNaoRepetidos = new HashSet<String>();
		nomesNaoRepetidos.add("Astesio");
		nomesNaoRepetidos.add("João1");
		nomesNaoRepetidos.add("Astesio");
		nomesNaoRepetidos.add("João");
		
		System.out.println("O tamaho da minha lista é: " + nomesNaoRepetidos.size());
		
		Set<Conta> contas = new HashSet<Conta>();
		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(500.0);
		Conta c3 = new Conta(200.0);
		contas.add(c1);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas.size());
		
	}
}
