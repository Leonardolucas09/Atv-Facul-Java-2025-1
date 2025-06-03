import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AppFilmes {
    private Filme[] lista;

    public void lerArquivo(String nomeArquivo) {
        File bilheteria = new File("bilheteria.txt");

        try {
            FileReader fr = new FileReader(bilheteria);
            BufferedReader br = new BufferedReader(fr);

            int qtdFilmes = 0;
            String primeiraLinha = br.readLine();

            while (br.ready()) {
                qtdFilmes = Integer.parseInt(primeiraLinha.trim()); //Transforma em inteiro e remove quaisquer espaçamentos
                System.out.println("Quantiadade de Filmes: " + qtdFilmes);
            }
            lista = new Filme[qtdFilmes];
        } 
    }
}
