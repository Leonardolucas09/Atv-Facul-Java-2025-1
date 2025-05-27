public class Cachorro extends Animal {
    private int alturaPelo;

    public Cachorro(String especie, double pesoMedio, int alturaPelo) {
        super(especie, 15);
        this.alturaPelo = alturaPelo;
    }

    @Override
    public void falar() {
        System.out.println("[Cachorro] Latindo");
    }

}
