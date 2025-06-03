public class desenhaTrianguloMain {
    public static void desenhaTriangulo(int altura) {
        for (int l = 0; l <= altura; l++) {
            for (int c = 0; c < l; c++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        desenhaTriangulo(6);
    }
}
