package exercises.ex1;

public class Gerente extends Funcionario {
    private double bonus;
    
    @Override
    public void calcularBonus() {
        bonus = 1000;
        double salarioComBonus = getSalario() + bonus;
        System.out.println("Salário do Gerente com bônus: R$" + salarioComBonus);
    }

    public double getBonus() {
        return bonus;
    }
}