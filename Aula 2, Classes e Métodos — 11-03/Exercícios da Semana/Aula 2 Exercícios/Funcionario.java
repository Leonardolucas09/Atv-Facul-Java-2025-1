public class Funcionario{
    private String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public void exibeFuncionario() {
        System.out.println("Nome do Funcionário: " + nome);
    }
}