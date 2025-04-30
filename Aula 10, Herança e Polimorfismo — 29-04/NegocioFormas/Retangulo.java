package NegocioFormas;

public class Retangulo extends Forma{
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        super();
        setNome("Retângulo");
        this.altura = altura;
        this.largura = largura;
    }

    public void calculaArea() {
        double resultado = largura * altura;
        setArea(resultado);
        System.out.println(resultado);
    }

    public void exibeDados() {
        super.exibeDados();
    }
}
