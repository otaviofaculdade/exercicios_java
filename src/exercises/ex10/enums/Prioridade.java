package exercises.ex10.enums;

public enum Prioridade {
	BAIXA(1),
    MÉDIA(2),
    ALTA(3),
    URGENTE(4);
	
	private final int prioridade;
	
	Prioridade(int prioridade){
		this.prioridade= prioridade;
	}
	
	public int getPrioridade() {
        return prioridade;
    }
}

