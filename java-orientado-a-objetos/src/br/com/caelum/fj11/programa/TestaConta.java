package br.com.caelum.fj11.programa;
import br.com.caelum.fj11.excecao.SaldoInsuficienteException;
import br.com.caelum.fj11.modelo.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta();
		
		joao.deposita(50.0);
		try {
			joao.saca(300.0);			
		} catch(SaldoInsuficienteException e) { 
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		}
		catch(Exception e ){
			System.out.println("Um outro erro qualquer");
		}
		System.out.println(joao.getSaldo());
	}
}
