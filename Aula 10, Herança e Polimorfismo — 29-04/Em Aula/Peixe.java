public class Peixe extends Animal {
    private int qtdNadadeiras;

    public Peixe(String n, int i, double p, String e, int qtdNadadeiras){
        super(n, qtdNadadeiras, p, e);
        this.qtdNadadeiras = qtdNadadeiras;
    }
}