package exercises.ex10;

import exercises.ex10.entities.Designer;
import exercises.ex10.entities.Programador;
import exercises.ex10.enums.Prioridade;

public class App {
	public static void main(String[] args) {
        Projeto projeto = new Projeto("Sistema de Gestão");

        Designer designer = new Designer();
        designer.setNome("Alice");

        Programador programador = new Programador();
        programador.setNome("Bob");

        projeto.adicionarMembro(designer);
        projeto.adicionarMembro(programador);

        projeto.adicionarTarefa(new Tarefa("Criar protótipo no Figma", Prioridade.MÉDIA));
        projeto.adicionarTarefa(new Tarefa("Implementar API REST", Prioridade.ALTA));

        projeto.exibirProjeto();
    }
}