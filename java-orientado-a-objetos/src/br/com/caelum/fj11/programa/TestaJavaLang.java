package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.modelo.Cliente;
import br.com.caelum.fj11.modelo.Conta;
import br.com.caelum.fj11.modelo.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {

		Conta c1 = new Conta(500.00);
		Conta c2 = new Conta(500.00);

		GuardadorDeObjetos amario = new GuardadorDeObjetos();
		amario.adiciona(c1);
		amario.adiciona(c2);

		Cliente joao = new Cliente();
		joao.setNome("João Luiz");
		joao.setEndereco("Rua: Aimores 41 Bairro: Bom Jardim");
		amario.adiciona(joao);

		Conta c1NoArmario = (Conta) amario.pega(0);
		Cliente joaoNoArmaro = (Cliente) amario.pega(2);

		System.out.println(c1NoArmario.getSaldo());
		System.out.println(joaoNoArmaro.toString());
		
		if(c1.equals(c2)){ // programador garante!!!
			System.out.println("São iguais");
		}else{
			System.out.println("São Diferentes");
		}
		
	}
}
