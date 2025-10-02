package exercises.ex8;

public class Carro {
	private Motor motor;
	private String modelo;
	
	public Carro(String modelo, double potenciaMotor) {
		this.modelo = modelo;
		this.motor = new Motor(potenciaMotor);
	}
	
	public void mostrarPotenciaCarro() {
		System.out.println("A potência do carro de modelo "+getModelo()+" é "+motor.getPotencia()+" cavalos de roda.");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
