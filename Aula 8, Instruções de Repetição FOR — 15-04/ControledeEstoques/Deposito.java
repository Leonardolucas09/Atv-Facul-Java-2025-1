package ControledeEstoques;

public class Deposito {
    private int codigo;
    private String endereco;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public Deposito(int codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void incluirProdutos(Produto p1, Produto p2, Produto p3) {
        this.produto1 = p1;
        this.produto2 = p2;
        this.produto3 = p3;
    }

    public void reabastece(int numeroProduto, int quantidade) {
        if (numeroProduto == 1) {
            produto1.reabasteceEstoque(quantidade);
        }

        else if (numeroProduto == 2) {
            produto2.reabasteceEstoque(quantidade);
        } 
        
        else if (numeroProduto == 3) {
            produto3.reabasteceEstoque(quantidade);
        } else {
            System.out.println("Número de produto inválido (use 1, 2 ou 3)");
        }
    }

    public void baixar(int numeroProduto, int quantidade) {
        if (numeroProduto == 1) {
            produto1.baixarEstoque(quantidade);
        }

        else if (numeroProduto == 2) {
            produto2.baixarEstoque(quantidade);
        } 
        
        else if (numeroProduto == 3) {
            produto3.baixarEstoque(quantidade);
        } else {
            System.out.println("Número de produto inválido (use 1, 2 ou 3)");
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório do Depósito");
        System.out.println("Código: " + codigo + " Endereço: " + endereco);
        System.out.println("-----------------------------------------");
        System.out.println("Produto: " + produto1.getNome() + " Quantidade: " + produto1.getQuantidade());
        System.out.println("Produto: " + produto2.getNome() + " Quantidade: " + produto2.getQuantidade());
        System.out.println("Produto: " + produto3.getNome() + " Quantidade: " + produto3.getQuantidade());
        System.out.println("-----------------------------------------");
    }
        
}
