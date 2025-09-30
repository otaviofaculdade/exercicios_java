package exercises.ex2;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.printf("A área do círculo é igual a %.2f m2.%n", area);
    }
}