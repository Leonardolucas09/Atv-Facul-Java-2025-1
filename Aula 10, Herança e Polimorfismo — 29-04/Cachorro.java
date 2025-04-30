public class Cachorro extends Animal {
    private int qtdPatas;

    public Cachorro(String n, int i, double p, String e, int qtdPatas) {
        super(n, i, p, e); //chama o construtor da 
        this.qtdPatas = qtdPatas;
    }
}