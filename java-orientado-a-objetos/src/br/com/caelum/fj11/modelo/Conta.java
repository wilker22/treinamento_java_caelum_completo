package br.com.caelum.fj11.modelo;
public class Conta {
	private double saldo;
	private String nome;
	private int agencia;

	public Conta() {
	}

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Conta(double saldo){	
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valorASerDepositado) {
		this.saldo += valorASerDepositado;
	}
	/**
	 * realiza um saque na conta dado um valor passado
	 * @param valorASerSacado o valor a ser sacado da conta
	 * @throws Exception caso o saldo seja insuficiente
	 */
	public void saca(double valorASerSacado) throws Exception {
		if(this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
		}
		else {
//			throw new SaldoInsuficienteException(saldo);
			throw new RuntimeException();
		}
	}

	public void imprime() {
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);
	}
	
	@Override
	public String toString() {
		return "Conta com saldo " + saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) return false;
		
		Conta outra = (Conta) obj;
		return outra.saldo == this.saldo;
//		if(outra.saldo == this.saldo) return true;
//		else return false;
	}
}