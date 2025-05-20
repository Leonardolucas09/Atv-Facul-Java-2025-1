package Livraria;

public class Teste {
    public static void main(String[] args) {
        Produto livro1 = new Livro(24, "Outsider", 67);
        System.out.println("[" + livro1.getNome() + "] - preço: R$ " + String.format("%.2f", livro1.getPreco(true)));

        Produto livro2 = new Livro(25, "IT - A Coisa", 95);
        System.out.println("[" + livro2.getNome() + "] - preço: R$ " + String.format("%.2f", livro2.getPreco(false)));

        Produto livro3 = new Livro(26, "A Torre Negra", 95);
        System.out.println("[" + livro3.getNome() + "] - preço: R$ " + String.format("%.2f", livro3.getPreco(true)));
    }
}
