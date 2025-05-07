public class Funcionario {
    private String nome;
    private String matricula; 
    private double valorHora;

    public Funcionario(String nome, String matricula, double valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
    }

    public double calcularSalario(double horas) {
        return horas * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getValorHora() {
        return valorHora;
    }
}