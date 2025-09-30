package exercises.ex4;

public class SistemaPagamento {
	Boleto boleto = new Boleto("FDSAFDSADS");
	CartaoCredito cartao = new CartaoCredito(52151);
	
	public void pagar() {
		System.out.println("Realizando pagamentos!");
		boleto.pagar();
		cartao.pagar();
	}
}
