public class Funcionario{
    //comentários
    
    private String nome;
    private double salario;
    private int numeroDependentes;
    
    //construtor da classe
    public Funcionario(String nome, double salario, int numeroDependentes) {
        this.nome = nome;
        this.salario = salario;
        this.numeroDependentes = numeroDependentes;
        
    }
    
    public Funcionario(String nome, int numeroDependentes) {
        this.nome = nome;
        this.numeroDependentes = numeroDependentes;
        
        this.salario = 2100;
    }
    
    //recebe um valor adicionado ao salario da criatura
    public void aumentaSalario(double aumento) {
        salario = salario + aumento;
        
        //OU
        
        //salario += aumento;
        
    }
    
    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: " + salario);
        System.out.println("Número de Dependentes: " + numeroDependentes);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    };
    
    public void setSalario(double salario){
        this.salario = salario;
    };
    
    public void setNumeroDependentes(int numeroDependentes){
        this.numeroDependentes = numeroDependentes;
    }
    
}