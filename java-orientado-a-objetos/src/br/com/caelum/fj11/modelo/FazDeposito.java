package br.com.caelum.fj11.modelo;

public class FazDeposito implements Runnable {
	private final Conta conta;
	public FazDeposito(Conta outraConta){
		this.conta = outraConta;
	}
	@Override
	public void run() {
		conta.deposita(100.0);
	}
}
