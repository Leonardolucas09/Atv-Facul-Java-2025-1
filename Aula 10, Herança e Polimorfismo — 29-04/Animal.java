public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    public Animal(String nome, int idade, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    public void respitar() {
        System.out.println("Animal respirando!");
    }
}