package NegocioFormas;

public class TesteForma {
    public static void main(String[] args) {
            
        Teclado t = new Teclado();
            // Forma f = new Forma();
        char escolha = t.leChar("Digite 'C' (Circulo) ou 'R' (Retângulo). X para parar.");
            
        while(escolha != 'X' || escolha != 'x'){
                
            if (escolha == 'C' || escolha == 'c') {
                double raio = t.leDouble("Informe o valor da raio");
                Circulo circulo = new Circulo(raio);
                circulo.calculaArea();
                circulo.exibeDados();
            } 
            
            else if (escolha == 'R' || escolha == 'r'){
                double altura = t.leDouble("Informe a altura");
                double largura = t.leDouble("Informe a largura");
                Retangulo retangulo = new Retangulo(altura, largura);
                retangulo.calculaArea();
                retangulo.exibeDados();
            }
            System.out.println("Finalizado.");
            break;
        }

        

        
    }
}
