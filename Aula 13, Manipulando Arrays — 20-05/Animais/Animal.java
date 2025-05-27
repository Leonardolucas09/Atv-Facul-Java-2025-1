public class Animal {
    private String especie;
    private double pesoMedio;

    public Animal(String especie, double pesoMedio) {
        this.especie = especie;
        this.pesoMedio = pesoMedio;
    }

    public final void respirar() {
        System.out.println("[Animal] Respirando");
    }

    public void falar() {
        System.out.println("[Animal] Falando sem voz ainda");
    }
}
