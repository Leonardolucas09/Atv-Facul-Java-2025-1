public class Main {
    public static void main (String[] args) {
        Teclado t = new Teclado();
        
        //Exercício 1
        /*Calculadora c1 = new Calculadora();
        
        //System.out.println("Estamos fazendo uma soma")
        double n1 = t.leDouble("Informe o primeiro numero");
        double n2 = t.leDouble("Informe o segundo numero");
        System.out.println("Essa é uma soma com os números " + c1.somar(n1,n2));
        System.out.println("Essa é uma subtração com os números " + c1.subtrair(n1,n2));
        System.out.println("Essa é uma multiplicação com os números " + c1.multiplicar(n1,n2));
        System.out.println("Essa é uma divisão com os números " + c1.dividir(n1,n2));*/
        
        //Exercício 2
        /*int num = t.leInt("Informe o número da conta: ");
        int age = t.leInt("Informe o número da agência: ");
        String tit = t.leString("Informe o nome do titular: ");
    
        ContaBancaria cb1 = new ContaBancaria(num, age, tit);
        
        //cb1.imprimirInfosConta();
        
        cb1.depositar(200.00);
        
        cb1.depositar(80.40);

        cb1.sacar(100.00);
        
        cb1.sacar(20.50);
        cb1.imprimirInfosConta();
        
        /*double dep = t.leDouble("Digite o valor que quer depositar: ");
        cb1.depositar(dep);
        
        double saq = t.leDouble("Digite o valor que quer sacar: ");
        cb1.sacar(saq);*/
        
        //Exercício 3
        
        /*FichasAtendimento fa1 = new FichasAtendimento();
        fa1.adicionarCliente();
        fa1.adicionarCliente();
        fa1.imprimeTamanhoFila();
        fa1.atenderCliente();
        fa1.imprimeTamanhoFila();
        fa1.adicionarCliente();
        fa1.atenderCliente();
        fa1.adicionarCliente();
        System.out.println(fa1.verificarFilaVazia()); */
        
        //Exercício 4
        
        /*Pedido p1 = new Pedido();
        p1.adicionarItem(5.40, 4);
        p1.imprimirResumoConta();
        System.out.println();
        p1.adicionarItem(19.30, 1);
        p1.imprimirResumoConta();
        System.out.println();
        p1.adicionarItem(12.10, 3);
        p1.imprimirResumoConta();*/
    }
}