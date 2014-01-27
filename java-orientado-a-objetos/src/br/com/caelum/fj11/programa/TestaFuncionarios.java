package br.com.caelum.fj11.programa;
import br.com.caelum.fj11.modelo.Gerente;
import br.com.caelum.fj11.modelo.TotalizadorDeBonus;

public class TestaFuncionarios {
	public static void main(String[] args) {
		//Polimorfismo Funcionario não pode ter mais new Funcionario, mas funcionario é um gerente
		
//		Funcionario joaquim = new Gerente();
//		joaquim.cobraEntrega();
	
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.00);
		System.out.println(joaquim.getBonus());

		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adciona(joaquim);
	}
}