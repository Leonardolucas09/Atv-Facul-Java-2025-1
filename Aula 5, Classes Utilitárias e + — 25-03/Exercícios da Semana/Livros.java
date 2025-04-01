public class Livros {
    private int codigo;
    private String titulo;
    private String situacao;

    public Livros(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.situacao = "disponível";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void retira() {
        if (situacao.equals("disponível")) {
            situacao = "emprestado";
            System.out.println("O livro " + titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + titulo + " já está emprestado.");
        }
    }

    public void devolve() {
        if (situacao.equals("emprestado")) {
            situacao = "disponível";
            System.out.println("O livro " + titulo + " foi devolvido.");
        } else {
            System.out.println("O livro " + titulo + " já está disponível.");
        }
    }

    public void exibeDados() {
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Situação: " + situacao);
    }
}
