package exercises.ex10;

import exercises.ex10.enums.Prioridade;

public class Tarefa {
	private String descricao;
	private Prioridade prioridade;
	
	public Tarefa(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public void mostrarTarefa() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade + " (" + prioridade.getPrioridade() + ")");
    }
}
