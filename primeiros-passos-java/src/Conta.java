public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private int agencia;
	private static int totalDeContas = 0;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	public void saca(double valorASerSacado) {
		if(this.saldo < valorASerSacado + this.limite){
			System.out.println("Valor insuficiente");	
		}
		else {
			this.saldo -= valorASerSacado;
		}
	}

	// mudança dificil de se perceber proquer tiramos a conta origem
	public void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}