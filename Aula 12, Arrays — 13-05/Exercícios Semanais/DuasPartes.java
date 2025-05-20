public class DuasPartes {
    public static void main(String[] args) {
        int[] sequencia = new int[10];

        for (int i = 0; i < 5; i++) {
            sequencia[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
            sequencia[i + 5] = (i + 1) * 10;
        }

        for (int i = 0; i < sequencia.length; i++) {
            System.out.println(sequencia[i]);
        }

    }
}
