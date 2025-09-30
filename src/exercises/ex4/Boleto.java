package exercises.ex4;

public class Boleto implements Pagavel {
	private String codigo;

	public Boleto(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	@Override
	public void pagar() {
		System.out.println("Método de pagamento escolhido: Boleto");
		System.out.println("Escaneie o código de barras: "+codigo);
	}
}
