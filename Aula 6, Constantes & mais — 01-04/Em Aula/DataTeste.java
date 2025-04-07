public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(6, 11, 2014);
        d1.escreveData();

        Data d2 = new Data(6, 11, 2014);
        d2.escreveData();

        System.out.println(d1.equals(d2));

        //testando ano bissexto
        int [] anos = {1925, 1984, 2000, 2004, 2014, 2026};

        for (int a : anos) {
            Data data = new Data(1, 1, a);
            System.out.println("Ano - " + a + ": " + data.ehBissexto());
        }
    }
}
