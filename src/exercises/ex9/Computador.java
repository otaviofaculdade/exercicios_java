package exercises.ex9;

public class Computador {
	private Memoria memoria;
	private Processador processador;
	
	public Computador(double memoria, String processador) {
		super();
		this.memoria = new Memoria (memoria);
		this.processador = new Processador (processador);
	}
	
	public void mostrarInfos() {
		System.out.println("O computador possui o processador "+ processador.getModelo()+", com capacidade de memória de "+memoria.getCapacidade()+"GB.");
	}
}
