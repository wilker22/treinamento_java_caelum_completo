package br.com.caelum.fj11.modelo;
public abstract class Funcionario {
	private String nome;
	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	// obgrigando class filhas
	public abstract double getBonus();

	public String getNome() {
		return nome;
	}
}