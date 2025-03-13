public class Teste {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Jorge", 0);
        f1.exibeDados();
        
        Funcionario f2 = new Funcionario("Edna Moda", 2800, 1);
        f2.exibeDados();

        f2.setSalario(3200);
        
        Quadrado q1 = new Quadrado();
        q1.exibeLado();
        
        q1.setLado(10);
        q1.exibeLado();
        
        q1.setLado(18);
        q1.exibeLado();
        
        //como construtor
        
        /*Quadrado q2 = new Quadrado(10);*/
        
        ContaBancaria cb1 = new ContaBancaria(1, 2900);
        cb1.exibeContaBancaria();
        
        Carros c1 = new Carros("JB29AH", 120);
        c1.exibeCarros();
        
    }
}