public class CincoNumerosQuadrado {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        double d = 0;
        int i = 1;
        for (; i <= 5; i++){
            d = t.leDouble();
            if (d > 0){
                System.out.println(Math.pow(d, 2));
            }
        }
    }
}