public class Programador extends Funcionario {
    private String lingProgramacao;

    public Programador(String nome, String cpf, int matricula, String lingProgramacao) {
        super(nome, cpf, matricula);
        this.lingProgramacao = lingProgramacao;
    }

    public String getLingProgramacao() {
        return lingProgramacao;
    }
}