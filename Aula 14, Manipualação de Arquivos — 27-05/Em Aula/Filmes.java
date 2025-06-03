import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Filmes {
    public static void main(String[] args) {
        File filmes = new File("filmes.txt");

        //Ler o arquivo
        try{
            FileReader fr = new FileReader(filmes);
            BufferedReader br = new BufferedReader(fr);
            
            while(br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            
            br.close();
            fr.close();
        } catch(IOException e) {
            System.out.println("Problema ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
