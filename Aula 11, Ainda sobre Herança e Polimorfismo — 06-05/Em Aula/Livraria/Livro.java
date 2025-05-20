package Livraria;

public class Livro extends Produto {
    public Livro(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double getPreco(boolean estudante) {
        double precoBase = super.getPreco(estudante);
        if (estudante == true) {
            double desconto = precoBase * 0.18;
            double precoDescontado = precoBase - desconto;
            return precoDescontado;
        }
        return precoBase;
    }
}
