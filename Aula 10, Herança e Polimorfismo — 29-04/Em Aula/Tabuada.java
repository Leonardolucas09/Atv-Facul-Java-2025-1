public class Tabuada {
    public static void imprimeTabuada(int numero){
        for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Teclado t = new Teclado();
        int valor = t.leInt("Informe o valor a ser multiplicado: ");
        imprimeTabuada(valor);
    }
}