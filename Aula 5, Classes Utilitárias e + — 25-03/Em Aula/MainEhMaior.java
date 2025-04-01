public class MainEhMaior {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        
        int num1 = t.leInt("Informe o primeiro número: ");
        int num2 = t.leInt("Informe o segundo número: ");

        EhMaior em = new EhMaior(num1, num2);
        em.verificaMaior();
    }
}
