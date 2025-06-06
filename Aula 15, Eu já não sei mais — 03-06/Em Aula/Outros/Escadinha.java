package Outros;
public class Escadinha {
    public static void main(String[] args) {
        System.out.println();
        for (int l = 0; l <= 5; l++) {
            for (int c = 0; c < l; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}