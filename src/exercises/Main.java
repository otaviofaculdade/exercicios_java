package exercises;

import exercises.ex1.Desenvolvedor;
import exercises.ex1.Gerente;
import exercises.ex2.Circulo;
import exercises.ex2.Retangulo;
import exercises.ex3.Impressora;
import exercises.ex4.SistemaPagamento;
import exercises.ex5.DiaSemana;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exercício 1.");
		Desenvolvedor dev = new Desenvolvedor();
		Gerente gerente = new Gerente();
		dev.setSalario(3000);
		gerente.setSalario(5000);
		
		System.out.println("Salários com bônus!");
		dev.calcularBonus();
		gerente.calcularBonus();
		System.out.println("------------------------\n");
		
		System.out.println("Exercício 2.");
		Circulo circulo = new Circulo(5.0);
		Retangulo retangulo = new Retangulo(10.0,5.0);
		System.out.println("Área das figuras!");
		circulo.calcularArea();
		retangulo.calcularArea();
		System.out.println("------------------------\n");
		
		System.out.println("Exercício 3.");
		Impressora imp = new Impressora();
		imp.imprimindo();
		System.out.println("------------------------\n");
		
		System.out.println("Exercício 4.");
		SistemaPagamento pagamento = new SistemaPagamento();
		pagamento.pagar();
		System.out.println("------------------------\n");
		
		System.out.println("Exercício 5.");
		for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia + ": " + dia.getDescricao());
        }
		System.out.println("------------------------\n");
	}
}