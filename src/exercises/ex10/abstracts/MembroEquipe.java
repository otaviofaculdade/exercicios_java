package exercises.ex10.abstracts;

public abstract class MembroEquipe {
	private String nome;

	public abstract void trabalhar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
