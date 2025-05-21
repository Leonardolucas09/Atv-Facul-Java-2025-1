public class Teste{
    public static boolean ArrayInteiros(int[] lista, int x) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] listaTeste = {10, 8, 6, -3, -1, 0};
        // boolean resultado = ArrayInteiros(listaTeste, 6);
        
        System.out.println(Teste.ArrayInteiros(listaTeste, 0));
    }
}