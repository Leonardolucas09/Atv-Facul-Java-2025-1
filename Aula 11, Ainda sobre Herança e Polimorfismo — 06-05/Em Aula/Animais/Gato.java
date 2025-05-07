package Animais;

public class Gato extends Animal {
    public Gato(String especie, int idade) {
        super(especie, idade);
    }

    public void lamberCauda() {
        System.out.println("[Gato] Lambendo cauda");
    }

    public void falar() {
        System.out.println("[Gato] Miando");
    }
}
