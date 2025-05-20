public class XYZ {
    public static void main(String[] args) {
        int[] x = new int[4];
        int[] y = new int[4];
        int[] z = new int[4];

        for (int i = 0; i < 4; i++){
            System.out.println(x[i] = i);
            System.out.println(y[i] = x[i]++);
            System.out.println(z[i] = x[i] + y[i]);
        }

    }
}