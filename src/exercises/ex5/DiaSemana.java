package exercises.ex5;

public enum DiaSemana {
	DOMINGO("Fim de semana"),
    SEGUNDA("Primeiro dia útil"),
    TERCA("Segundo dia útil"),
    QUARTA("Terceiro dia útil"),
    QUINTA("Quarto dia útil"),
    SEXTA("Quinto dia útil"),
    SABADO("Fim de semana");
	
	private final String descricao;
	
	DiaSemana(String descricao){
		this.descricao= descricao;
	}
	
	public String getDescricao() {
        return descricao;
    }
}