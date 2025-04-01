public class EhMaior {
    private int valor1;
    private int valor2;

    public EhMaior(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void verificaMaior() {
        if (valor1 > valor2) {
            System.out.println("Maior: " + valor1);
            return;
        }

        else if (valor1 < valor2) {
            System.out.println("Maior: " + valor2);
            return;
        } else {
            System.out.println("Os dois são iguais");
        }
        
    }
}
