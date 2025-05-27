public class Peixe extends Animal {
    private int qtdNadadeiras;

    public Peixe(String especie, double pesoMedio, int qtdNadadeiras) {
        super(especie, 6);
        this.qtdNadadeiras = qtdNadadeiras;
    }

    @Override
    public void falar() {
        System.out.println("[Peixe] blub. blub.");
    }

    public void nadar() {
        System.out.println("[Peixe] Nadando");
    }
}
