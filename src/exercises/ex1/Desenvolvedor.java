package exercises.ex1;

public class Desenvolvedor extends Funcionario {
    private double bonus;
    
    @Override
    public void calcularBonus() {
        bonus = 500;
        double salarioComBonus = getSalario() + bonus;
        System.out.println("Salário do Desenvolvedor com bônus: R$" + salarioComBonus);
    }

    public double getBonus() {
        return bonus;
    }
}