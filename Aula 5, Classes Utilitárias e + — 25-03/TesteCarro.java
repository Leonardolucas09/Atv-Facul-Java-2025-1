import java.util.Random;
import java.util.Scanner;

public class TesteCarro{
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        Random geradorNumero = new Random();
        int numero = geradorNumero.nextInt(10) + 1;

        System.out.print("Escolha um número ");
        int escolha = scanner.nextInt();
        
        if (escolha == numero) {
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou... o número sorteado foi " + numero);
        }

        
        /*Carro c1 = new Carro("JDSAWS", 16);
        c1.imprimeNivelTanque();
        
        c1.abastece(50);
        c1.imprimeNivelTanque();
        
        c1.anda(32);
        c1.imprimeNivelTanque();
        
        c1.anda(3000);
        c1.imprimeNivelTanque();*/
        
        
        
    }
}