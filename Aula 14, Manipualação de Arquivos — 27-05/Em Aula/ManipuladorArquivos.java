import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ManipuladorArquivos {
    public static void main(String[] args) {
        File arquivo = new File("frutas.txt");

        if(arquivo.exists()){
            System.out.println("Existe o aquivo");
           } else{
            System.out.println("Não existe o aquivo");
            
            try{    
                //tenta criar o arquivo caso não exista
                arquivo.createNewFile();
                System.out.println("Arquivo criado");
            } catch(IOException e){
                System.out.println("Problema ao criar arquivo");
                e.printStackTrace();
            }
        }

        //escrever no arquivo
        try{    
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Brr Brr Patapim");
            bw.newLine();
            bw.write("Meláo");
            bw.newLine();

            bw.close();
            fw.close();     

        } catch(IOException e){
            System.out.println("Problema ao escrever no arquivo");
            e.printStackTrace();
        }

        //Ler um arquivo
        try{    
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);  
            
            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
            fr.close();

        } catch(IOException e){
            System.out.println("Problema ao ler o arquivo");
            e.printStackTrace();
        }

    }
}
