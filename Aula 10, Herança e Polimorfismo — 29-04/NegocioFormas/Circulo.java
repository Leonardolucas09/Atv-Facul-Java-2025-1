package NegocioFormas;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        super();
        setNome("Circulo");
        this.raio = raio;
    }

    public void calculaArea() {
        double PI = 3.14;
        double resultado = PI*Math.pow(raio, 2);
        setArea(resultado);
    }

    public void exibeDados() {
        super.exibeDados();
    }
}
