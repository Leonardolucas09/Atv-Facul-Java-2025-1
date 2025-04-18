package ControledeEstoques;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz");
        Produto p2 = new Produto("Feijão");
        Produto p3 = new Produto("Massa");

        Deposito deposito = new Deposito(4923, "Thomas de Azevedo, 239");

        deposito.incluirProdutos(p1, p2, p3);
        deposito.reabastece(1, 300);
        deposito.reabastece(2, 250);
        deposito.reabastece(3, 400);

        deposito.gerarRelatorio();
        
        deposito.baixar(2, 100);
        deposito.baixar(3, 200);
        
        deposito.gerarRelatorio();
    }
}
