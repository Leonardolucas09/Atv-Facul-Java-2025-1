public class Lampada {
    private boolean ligada;

    public void liga() {
        this.ligada = true;
    }

    public void desliga() {
        this.ligada = false;
    }

    public void observa() {
        if (ligada) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();
        Lampada lamp2 = new Lampada();

        lamp1.liga();
        lamp2.desliga();
        
        lamp1.observa();
        lamp2.observa();
    }
} 