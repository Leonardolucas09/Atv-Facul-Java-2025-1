public class Quadrados {
    public static void main(String[] args) {
        int[] lista = new int[11];

        for (int i = 0; i < lista.length; i++) {
           lista[i] = (int) Math.pow(i, 2);
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(i + " - " + lista[i]);
        }
    }
}
