package exercises.ex2;

public class Retangulo extends FormaGeometrica {
	private double lado1;
	private double lado2;

	public Retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
    public void calcularArea() {
		double area = lado1*lado2;
		 System.out.printf("A área do retângulo é igual a %.2f m2.%n", area);
	}
}
