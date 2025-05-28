import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cidade {
    public static void main(String[] args) {

        //Criando o arquivo Cidades
        File cidades = new File("cidades.txt");

        if (cidades.exists()) {
            System.out.println("Arquivo existente.");
        } else {
            System.out.println("Não existe esse arquivo. Criando...");
        }

        try {
            cidades.createNewFile();
            System.out.println("Arquivo criado.");
        } catch(IOException e) {
            System.out.println("Problema ao criar o arquivo!");
            e.printStackTrace();
        }

        //Escrever no arquivo
        Teclado t = new Teclado();
        try {
            FileWriter fw = new FileWriter(cidades, true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i < 5; i++){
                bw.write(t.leString("Informe a cidade " + i + ":"));
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println("Problema ao escrever no arquivo");
            e.printStackTrace();
        }
    }
}
