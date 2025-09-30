package exercises.ex4;

public class CartaoCredito implements Pagavel {
	private int numerocartao;

	public CartaoCredito(int numerocartao) {
		super();
		this.numerocartao = numerocartao;
	}
	
	@Override
	public void pagar() {
		System.out.println("Método de pagamento escolhido: cartão de crédito.");
		System.out.println("Este é o número do cartão: "+numerocartao);
	}
}
