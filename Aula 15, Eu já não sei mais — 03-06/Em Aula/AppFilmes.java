import java.io.File;
// import java.io.FileWriter;
// import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class AppFilmes {
    private Filme[] lista;

    public void lerArquivo(String nomeArquivo) throws java.io.IOException {
        File bilheteria = new File(nomeArquivo);

        if (!bilheteria.exists()) { //Caso haja um erro interrompe a execução
            System.out.println("[ERRO] Arquivo inexistente!");
            return;
        }
        FileReader fr = new FileReader(bilheteria);
        BufferedReader br = new BufferedReader(fr);

        int qtdFilmes = Integer.parseInt(br.readLine());

        this.lista = new Filme[qtdFilmes];
        int i = 0;

        while (br.ready()) {
            String linha = br.readLine();
            adicionaFilme(linha, i);
            
            i++;
        }
        
        fr.close();
        br.close();
    }

    public void adicionaFilme(String conteudo, int posicao) {
        String[] infos = conteudo.split(", ");

        String titulo = infos[0];
        int ano = Integer.parseInt(infos[1]);
        Long arrecadacao = Long.parseLong(infos[2]);

        Filme f = new Filme(titulo, ano, arrecadacao);
        this.lista[posicao] = f;
    }

    public void escreverFilmes() {
        System.out.println("(\"|Filme           |Ano    |Arrecadação");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("|" + lista[i].getTitulo() + " |" + lista[i].getAno() + " | US$ " + lista[i].getArrecadacao());
        }
    }

    public void escreverFilmesApos (int ano) {
        System.out.println("(\"|Filme           |Ano    |Arrecadação");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getAno() > ano) {
                System.out.println("|" + lista[i].getTitulo() + " |" + lista[i].getAno() + " | US$ " + lista[i].getArrecadacao());
            }
        }
    }

    public void pesquisaFilme (String texto) {
        System.out.println("= Pesquisa de filmes");
        System.out.println("Procurando por '" + texto + "'...");
        int total = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getTitulo().contains(texto)) {
                System.out.println("+ Ocorrência encontrada: " + lista[i].getTitulo());
                total++;
            }
        }
        
        if (total == 0) {
            System.out.println("- Nenhum filme encontrado.");
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        System.out.println("📽🎞 AppFilmes 🎞📽");
        AppFilmes app = new AppFilmes();
        Teclado t = new Teclado();

        app.lerArquivo("bilheteria.txt");
        app.escreverFilmes();

        int filtragemAno = t.leInt("Informe um ano para a pesquisa de filmes: ");
        app.escreverFilmesApos(filtragemAno);

        String pesquisa = t.leString("Informe um texto para a pesquisa de filmes: ");
        app.pesquisaFilme(pesquisa);

        pesquisa = t.leString("Informe um texto para a pesquisa de filmes: ");
        app.pesquisaFilme(pesquisa);
    }
}
