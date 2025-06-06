public class Filme {
    private String titulo;
    private int ano;
    private long arrecadacao;
    
    public Filme(String titulo, int ano, long arrecadacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.arrecadacao = arrecadacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public long getArrecadacao() {
        return arrecadacao;
    }    
    
}