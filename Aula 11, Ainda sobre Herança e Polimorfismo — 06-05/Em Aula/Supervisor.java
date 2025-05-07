public class Supervisor extends Funcionario {
    private double salarioBonus;

    public Supervisor(String nome, String matricula, double valorHora, double salarioBonus) {
        super(nome, matricula, valorHora);
        this.salarioBonus = salarioBonus;
    }

    public double calcularSalario(double horas) {
        double calculoSalario = super.calcularSalario(horas);
        double bonus = calculoSalario / 100 * salarioBonus;
        
        return calculoSalario + bonus;
    }

    public double getSalarioBonus() {
        return salarioBonus;
    }
}
