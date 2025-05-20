public class SequencialFinal {
    public static void main(String[] args) {
        int[] sequenciaFinal = new int[10];

        sequenciaFinal[0] = 3;

        int imparAtual = 1;

        for (int i = 1; i < sequenciaFinal.length; i++) {
            sequenciaFinal[i] = sequenciaFinal[i - 1] + imparAtual;
            imparAtual += 2;
        }

        for (int i = 0; i < sequenciaFinal.length; i++) {
            System.out.println(sequenciaFinal[i]);
        }
    }
}
