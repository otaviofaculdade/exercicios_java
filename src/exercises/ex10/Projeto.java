package exercises.ex10;

import java.util.ArrayList;
import exercises.ex10.abstracts.MembroEquipe;

public class Projeto {
    private String nome;
    private ArrayList<MembroEquipe> membros;
    private ArrayList<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public void adicionarMembro(MembroEquipe membro) {
        membros.add(membro);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void exibirProjeto() {
        System.out.println("Projeto: " + nome);

        System.out.println("\nMembros da equipe:");
        for (MembroEquipe membro : membros) {
            System.out.print("- " + membro.getNome() + ": ");
            membro.trabalhar();
        }

        System.out.println("\nTarefas:");
        for (Tarefa tarefa : tarefas) {
            tarefa.mostrarTarefa();
            System.out.println();
        }
    }
}