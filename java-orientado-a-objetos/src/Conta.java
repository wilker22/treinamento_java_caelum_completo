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

}