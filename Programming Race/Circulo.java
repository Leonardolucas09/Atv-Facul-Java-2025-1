public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
}