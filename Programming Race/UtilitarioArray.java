public class UtilitarioArray {
    public static int[] getInverso(int[] lista) {
        int[] listaInversa = new int[lista.length];
        int tamanho = lista.length;
            for (int i = 0; i < tamanho; i++) {
                    listaInversa[tamanho - 1 - i] = lista[i];
            }
            return listaInversa;
    }

    public static void main(String[] args) {
        int[] original = {5, 81, 10, 43, 72, 54};
        System.out.println(original);
        System.out.println(getInverso(original));
    }
}
