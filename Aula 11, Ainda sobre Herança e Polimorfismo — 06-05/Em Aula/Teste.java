public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Jorge", "40351", 50);
        System.out.println("Salário Base: " + f.calcularSalario(80));

        Supervisor s = new Supervisor("Joana", "40357", 60, 12);
        System.out.println("Salário Base: " + s.calcularSalario(80));
    }
}
