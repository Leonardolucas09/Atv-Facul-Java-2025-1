package Animais;

public class Animal {
    private String especie;
    private int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }

    public final void respirar() {
        System.out.println("[Animal] Respirando");
    }

    public void falar() {
        System.out.println("[Animal] Falando sem voz ainda");
    }
}
