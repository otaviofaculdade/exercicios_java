package exercises.ex10.entities;

import exercises.ex10.abstracts.MembroEquipe;

public class Programador extends MembroEquipe {
	@Override
	public void trabalhar() {
		System.out.println("O programador está fazendo o back-end da aplicação!");
	}
}
