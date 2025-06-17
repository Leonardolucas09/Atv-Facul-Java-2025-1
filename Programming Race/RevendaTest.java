import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RevendaTest {
    public static void main(String[] args) {
        Revenda revenda = null;
        
        try (BufferedReader br = new BufferedReader(new FileReader("veiculos.txt"))) {
            String primeiraLinha = br.readLine();
            int qtdVeiculos = Integer.parseInt(primeiraLinha.trim());

            System.out.println("A quantidade de veículos é: " + qtdVeiculos);

            revenda = new Revenda(qtdVeiculos);

            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                continue;
                }

                String[] infos = linha.split(",");
                String tipo = infos[0].trim();
                String placa = infos[1].trim();
                String cor = infos[2].trim();

                Veiculo veiculo = null;

                if ("C".equalsIgnoreCase(tipo)) {
                    // Garantir que há índices suficientes para Carro
                    if (infos.length < 5) {
                        System.out.println("Linha de carro com dados incompletos: " + linha);
                        continue;
                    }
                    int portas = Integer.parseInt(infos[3].trim());
                    int marchas = Integer.parseInt(infos[4].trim());
                    veiculo = new Carro(placa, cor, portas, marchas);
                } else if ("M".equalsIgnoreCase(tipo)) {
                    
                    if (infos.length < 6) { 
                        System.out.println("Linha de moto com dados incompletos: " + linha);
                        continue;
                    }
                    int cilindradas = Integer.parseInt(infos[5].trim());
                    veiculo = new Moto(placa, cor, cilindradas);
                } else {
                    System.out.println("Tipo de veículo desconhecido na linha: " + linha);
                    continue;
                }

                if (veiculo != null) {
                    revenda.adicionarVeiculo(veiculo);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        if (revenda != null) {
            System.out.println("\n\n=====Resultado da Revenda=====");

            System.out.println(revenda.getTotalVeiculos("Azul"));
            System.out.println(revenda.getTotalCarros());
            System.out.println(revenda.getTotalMotos(3));
        }
    }
}
