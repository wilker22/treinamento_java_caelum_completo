public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta("Mauricio", 123, 1400.00);
		conta.setNome("Mauricio");
		conta.imprime();
		System.out.println(conta.getNome());
	}
}
