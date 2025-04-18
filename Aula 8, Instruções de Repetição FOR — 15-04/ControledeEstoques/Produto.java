package ControledeEstoques;

public class Produto {
    private String nome;
    private int quantidade;   
    
    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void reabasteceEstoque (int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida para abastecimento.");
        }
    }

    public void baixarEstoque (int quantidade) {
        if (quantidade > 0) {
            if (this.quantidade > quantidade) {
                this.quantidade -= quantidade;
            } else {
                System.out.println("Estoque insuficiente para baixar " + quantidade + " unidades.");
            }
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }
}

