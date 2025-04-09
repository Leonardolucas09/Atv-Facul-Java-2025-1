import java.util.Random;

public class JogoAleatorio {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Random geradorNumero = new Random();

        int numeroSorteado = geradorNumero.nextInt(99) + 1;
        
        int chute = 0;
        int tentativas = 0;

        while (chute != numeroSorteado) {   
            chute = teclado.leInt("Chute um número de 1 a 10");
            if (chute != numeroSorteado) {
                System.out.println("Que pena, você errou...");
            } 
            
            if (chute > numeroSorteado) {
                System.out.println("O número éh menor do que o chute");
            }

            else if (chute < numeroSorteado) {
                System.out.println("O número éh maior do que o chute");
            }
            tentativas++;
        }
        System.out.println("Que sorte! Você acertou com " + tentativas + " tentativas!");
    }
}
