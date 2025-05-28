import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Numeros {
    public static void main(String[] args) {
        
            File numeros = new File("numeros.txt");
            
            int [] lista = new int[10];
            
            try {
                FileReader fr = new FileReader(numeros);
                BufferedReader br = new BufferedReader(fr);

                while(br.ready()) {
                    for (int i = 0; i < lista.length; i++) {
                        String linha = br.readLine();
                        int num = Integer.parseInt(linha);
                        lista[i] = num;  
                    }
                }
                for (int i = 0; i < lista.length; i++) {
                    System.out.println("Posição " + i + " - " + lista[i]);
                }

                br.close();
                fr.close();
        } catch(IOException e) {
            System.out.println("Problema ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
