package exercises.ex10.entities;

import exercises.ex10.abstracts.MembroEquipe;

public class Designer extends MembroEquipe {
	@Override
	public void trabalhar() {
		System.out.println("O designer está fazendo o Figma da aplicação!");
	}
}
