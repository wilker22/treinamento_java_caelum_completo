package br.com.caelum.fj11.programa;

public class TestaJavaLangString {
	public static void main(String[] args) {
		String curso = "fj11"; // Objetos do tipo strign são imutaveis não mudam
								// de valor
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase(); // lembrar sempre de reatribuir java não
										// muda String
		System.out.println(curso);
		
		double pi = 3.14;
		
		long numeroAredondado = Math.round(pi);
		System.out.println(numeroAredondado);
	}
}