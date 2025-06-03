package Frutas;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MainFruta {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        Fruta[] frutas = new Fruta[8];

        int bergamotasCriadas = 0;
        int abacaxisCriados = 0;
        int bergamotasMais5Gomos = 0;
        int abacaxiCayenne = 0;
        // boolean abacaxiCayenneEncontrado = false;
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Criando fruta " + (i + 1) + " de " + frutas.length);
            String tipo = t.leString("Digite 'B' para Bergamota ou 'A' para Abacaxi:").toUpperCase();
            
            if (tipo.equals("B")) {
                int qtdGomos = t.leInt("Informe a quantidade de gomos da bergamota:");
                int qtdSementes = t.leInt("Informe a quantidade de sementes da bergamota:");

                frutas[i] = new Bergamota("laranja", qtdSementes, qtdGomos);
                bergamotasCriadas++;

                if (qtdGomos > 5) {
                    bergamotasMais5Gomos++;
                }
            }

            else if(tipo.equals("A")) {
                String variedade = t.leString("Defina a variedade do abacaxi:");
                
                frutas[i] = new Abacaxi("amarelo", variedade, 0);
                abacaxisCriados++;

                if (variedade.equalsIgnoreCase("cayenne")) {
                    // abacaxiCayenneEncontrado = true;
                    abacaxiCayenne++;
                }
            } else {
                System.out.println("Tipo inválido.");
            }
        }

        //Escrever no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("frutas.txt"))){
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Foram criadas " + bergamotasCriadas + " bergamotas");
            pw.println("Foram criados " + abacaxisCriados + " abacaxis");
            pw.println(bergamotasMais5Gomos + " bergamotas com mais que 5 gomos");
            pw.println(abacaxiCayenne + " abacaxis são da variedade 'cayenne'");
        
            pw.close();
        } catch (IOException e) {
            System.out.println("Problema ao escrever no arquivo");
            e.printStackTrace();
        }

        lerArquivo("frutas.txt");
    }

    public static void lerArquivo(String nomeArquivo) {
        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);

            
            while(br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Problema ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
