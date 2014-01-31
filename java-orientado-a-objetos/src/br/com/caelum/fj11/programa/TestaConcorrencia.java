package br.com.caelum.fj11.programa;

import br.com.caelum.fj11.modelo.Conta;
import br.com.caelum.fj11.modelo.FazDeposito;

public class TestaConcorrencia {
	public static void main(String[] args) throws InterruptedException {
//		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
//		Thread t1 = new Thread(barraDeProgresso);
//		t1.start();
//		
//		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
//		Thread t2 = new Thread(copiador);
//		t2.start();
		
		Conta conta = new Conta(500.0);
		FazDeposito acao = new FazDeposito(conta);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(conta.getSaldo());
	}
}
