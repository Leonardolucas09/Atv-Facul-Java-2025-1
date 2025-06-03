package ListaCompras;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File compras = new File("listaCompras.txt");

        try {
            FileReader fr = new FileReader(compras);
            BufferedReader br = new BufferedReader(fr);

            int qtdItens = 0;
            String primeiraLinha = br.readLine();

            if (primeiraLinha != null) {
                try {
                    qtdItens = Integer.parseInt(primeiraLinha.trim()); //trim() remove os espaços em brancos no início ou fim da string
                    System.out.println("Quantidade de itens na lista: " + qtdItens);
                } catch (NumberFormatException e) { //Se a primeira linha não tiver um número válido lança a exceção
                    System.err.println("Erro: A primeira linha, não é um número válido.");
                    e.getMessage();
                    return;
                }

            } else {
                System.err.println("Erro: O arquivo está vazio ou a primeira linha não foi lida.");
                return;
            }

            String[] listaCompras = new String[qtdItens];

            for (int i = 0; i < listaCompras.length; i++) {
                String produto = br.readLine();
                
                if (produto != null) {
                    listaCompras[i] = produto.trim();
                    System.out.println("- " + listaCompras[i]);
                } else {
                    System.err.println("Erro. O arquivo terminou antes do esperado.");
                    for (int j = 1; j < listaCompras.length; j++) {
                        listaCompras[j] = null;
                    }
                    break;
                }
            }

            int produtosComM = 0;

            for (String produto : listaCompras) {
                if (produto != null && produto.startsWith("m")) {
                    produtosComM++;
                }
            }

            System.out.println("Quantos itens começam com a letra m? " + produtosComM);

            int produtosMaisDe5Letras = 0;

            for (String produto: listaCompras) {
                if (produto != null && produto.length() > 5) {
                    produtosMaisDe5Letras++;
                }
            }
            System.out.println("Quantos itens possuem mais que 5 letras? " + produtosMaisDe5Letras);

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
