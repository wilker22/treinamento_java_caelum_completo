package br.com.caelum.fj11.programa;
public class TestaExcecao {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			m1();	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Probema! Encontrado segurando a exception e continuando com o programa");
			System.out.println("Se não segurar ela vaza exibindo letras vermelhas e esquisitas");
		}
		System.out.println("Fim do main");
	}

	private static void m1() {
		System.out.println("Inicio do m1");
		m2();			
		System.out.println("Fim do m1");
	}

	private static void m2() {
		System.out.println("Inicio do m2");
		int[] numeros = new int[5];
		for(int i = 0; i < 6; i++){
			numeros[i] = i * 2;
			System.out.println(numeros[i]);				
		}
		System.out.println("Fim do m2");
	}
}