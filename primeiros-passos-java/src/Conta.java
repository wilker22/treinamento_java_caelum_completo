class Conta {
	int numero;
	double saldo;
	int agencia;
	Pessoa titular;
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca(double valorASerSacado) {
		if(this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
		}
	}
	
//	void transfere(double valor, Conta origem, Conta destino) {
//		this.saldo -= valor;
//		destino.saldo += valor;
//	}
	
	
	// mudança dificil de se perceber proquer tiramos a conta origem
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Pessoa {
	String nome;
	String cpf;
	String dataNascimento;
	
}

class Programa {
	public static void main(String[] args) {
		Conta mauricio = new Conta();
			mauricio.numero = 123;
			mauricio.saldo = 800.0;
			mauricio.agencia = 842;
			
			mauricio.titular = new Pessoa();
			mauricio.titular.nome = "Mauricio Aniche";
			mauricio.titular.cpf ="123456789";
			mauricio.titular.dataNascimento = "09/05/1989";
			
			mauricio.deposita(1000);
			mauricio.saca(1700.00);
			
			
		Conta guilherme = new Conta();
			guilherme.numero = 456;
			guilherme.saldo = 1200.0;
			
			guilherme.deposita(800.0);
			guilherme.saca(3000.0);
			
			mauricio.transfere(200, guilherme);
			guilherme.transfere(400, mauricio);
			
			
			System.out.println(mauricio.saldo);
			System.out.println(guilherme.saldo);
	}
}