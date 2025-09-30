package exercises.ex7;

public enum Moeda {
	REAL(1.00),
    DÓLAR(5.32),
    EURO(6.24);
	
	private final double taxaDeCambio;
	
	Moeda(double taxaDeCambio){
		this.taxaDeCambio= taxaDeCambio;
	}
	
	public double gettaxaDeCambio() {
        return taxaDeCambio;
    }
	
    public double conversao(double valor) {
        return valor * taxaDeCambio;
    }
}
