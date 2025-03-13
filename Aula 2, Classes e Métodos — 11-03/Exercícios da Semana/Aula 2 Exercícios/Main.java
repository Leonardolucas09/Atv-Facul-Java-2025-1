public class Main{
    public static void main(String[] args){
                
        //Exercício 3
        
        Carro c1 = new Carro();
        
        c1.setPlaca("GHJ-6789");
        c1.setConsumoMedio(12.5);
        c1.setNivelTanque(67.0);
        
        c1.exibeCarro();
        
        //Exercicio 4
        
        Retangulo r2 = new Retangulo(5.0, 3.0, 0.0);
        r2.exibeRetangulo();
        
        //Exercicio 5
        
        Funcionario f = new Funcionario("Fulano");
        //f = "Fulano";
        f.exibeFuncionario();
        
        //Exercicio 6
         
        //Da atividade D do 6:
        
        /* Foram instanciados dois objetos diferentes.*/
        Circulo cir1 = new Circulo(5.2); //Um objeto Círculo é criado
        /*cir1.setRaio(5.2);*/ //O valor do raio referenciado em cir1 é atribuido para o valor 5.2
        
        /* A linha abaixo é onde temos uma declaração de variáveis */
        Circulo cir2, cir3; //Declaramos duas variáveis, sem nenhum objeto criado para elas
        cir3 = cir1; //cir3 e cir1 referenciam a um mesmo objeto
        
        cir2 = new Circulo(8.0); //É criado um novo objeto com a variável cir2
        /*cir2.setRaio(8.0);*/ //O valor do raio referenciado em cir2 é atributo para 8.0
        
        cir3 = new Circulo(7.5); //Como cir3 aponta para cir1, substituimos o valor para 7.
    }
}