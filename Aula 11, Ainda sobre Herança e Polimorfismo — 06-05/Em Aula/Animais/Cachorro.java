package Animais;

public class Cachorro extends Animal {
    public Cachorro(String especie, int idade) {
        super(especie, idade);
    }

    public void falar() {
        System.out.println("[Cachorro] Latindo");
    }

    public void enterrarOsso() {
        System.out.println("[Cachorro] Enterrando osso");
    }
}
