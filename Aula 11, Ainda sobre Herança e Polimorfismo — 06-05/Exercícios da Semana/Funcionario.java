public class Funcionario {
    private String nome;
    private String cpf;
    private int matricula;

    public Funcionario(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
}