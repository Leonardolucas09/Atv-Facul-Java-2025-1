package Biblioteca;

public class Livro {
    private String titulo;
    private int anoPublicado;
    private Editora editora;
    private Autor autor;

    public Livro(String titulo, int anoPublicado, Editora editora, Autor autor) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.editora = editora;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public Editora getEditora() {
        return editora;
    }

    public Autor getAutor() {
        return autor;
    }
}
