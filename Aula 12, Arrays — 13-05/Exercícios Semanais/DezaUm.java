public class DezaUm {
    public static void main(String[] args) {
        int[] dezAUm = new int[10];

        for (int j = 0; j < dezAUm.length; j++){
            dezAUm[j] = 10 - j;
        }

        for (int i = 0; i < dezAUm.length; i++) {
            System.out.println(i + " - " + dezAUm[i]);
        }
    }
}
