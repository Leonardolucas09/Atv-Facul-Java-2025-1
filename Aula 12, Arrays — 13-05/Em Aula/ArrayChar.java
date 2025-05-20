public class ArrayChar {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        int qtd = teclado.leInt("Digite a quantidade de letras a serem lidas: ");

        char [] lista = new char[qtd];

        for (int i = 0; i < lista.length; i++) {
            char letra = teclado.leChar("Digite uma letra: ");   
            lista[i] = letra;
        }

        char escolha = teclado.leChar("Escolha de letra: ");
        int contador = 0;

        for (int j = 0; j < lista.length; j++){
            if (escolha == lista[j]){ 
                contador++;
            }
        }

        System.out.println("A letra escolhida [" + escolha + "], aparece " + contador + " vez(es).");
    }
}
