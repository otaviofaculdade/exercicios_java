package exercises.ex1;

public abstract class Funcionario {
	private String name;
	private double salario;
	
	public abstract void calcularBonus();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
