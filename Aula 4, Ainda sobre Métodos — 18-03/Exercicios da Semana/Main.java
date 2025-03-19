public class Main {
    public static void main (String[] args) {
        Teclado t = new Teclado();
        
        Calculadora c1 = new Calculadora();
        
        double n1 = t.leDouble("Informe o primeiro numero");
        double n2 = t.leDouble("Informe o segundo numero");
        System.out.println(c1.somar(n1,n2));
    }
}