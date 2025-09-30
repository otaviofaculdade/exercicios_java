package exercises.ex6;

public enum NivelPrioridade {
	BAIXA(1),
    MÉDIA(2),
    ALTA(3),
    URGENTE(4);
	
	private final int prioridade;
	
	NivelPrioridade(int prioridade){
		this.prioridade= prioridade;
	}
	
	public int getPrioridade() {
        return prioridade;
    }
}
