public class AlturaPessoas {
    public static void main(String[] args) {
        Teclado t = new Teclado();

        double altura = 0;
        double media = 0;
        for (int i = 0; i < 10; i++){
            altura = t.leDouble("Informe uma altura");
            media += altura;
        }
        System.out.println(media/10);
    }
}
