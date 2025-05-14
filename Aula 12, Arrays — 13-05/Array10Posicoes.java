public class Array10Posicoes {
    public static void main(String[] args) {
        int [] v = new int[10]; //Criação da lista com 10 posições
        for (int j = 0; j < v.length; j++) { //Para cada j = 0, enquanto j for menor q o tamanho da lista, incrementa +1;
            v[j] =  j + 10; //Para cada posição da lista, somamos j + 10
        }
        
        for (int i = v.length-1; i >= 0 ; i--) { //Para cada i, enquanto i for maior ou igual a zero, incrementa -1; 
            System.out.println("[" + i + "] - " + v[i]); //Imprime até o fim da condição
        }
    }
}