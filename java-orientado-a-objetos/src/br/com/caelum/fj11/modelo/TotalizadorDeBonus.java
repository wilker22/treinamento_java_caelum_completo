package br.com.caelum.fj11.modelo;

public class TotalizadorDeBonus {
	private double total = 0;

	public void adciona(Funcionario f) {
		this.total += f.getBonus();
	}

	public double getTotal() {
		return this.total;
	}
}