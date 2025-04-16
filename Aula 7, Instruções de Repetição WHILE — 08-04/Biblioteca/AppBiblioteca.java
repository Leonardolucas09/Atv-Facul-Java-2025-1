package Biblioteca;

public class AppBiblioteca {
    public static void main(String[] args) {
        Editora editora = new Editora("Suma", "São Paulo");
        Autor autor = new Autor("Stephen King", "Americano");
        Livro livro1 = new Livro("Outsider", 2018, editora, autor);
        Livro livro2 = new Livro("Holly", 2023, editora, autor);

        System.out.println(livro1.getTitulo() + "\n" + livro1.getAutor().getNome() + "\n" + livro1.getEditora().getNome() + ", " + livro1.getAnoPublicado());
        System.out.println(livro2.getTitulo() + "\n" + livro2.getAutor().getNome() + "\n" + livro2.getEditora().getNome() + ", " + livro2.getAnoPublicado());
    }
}
