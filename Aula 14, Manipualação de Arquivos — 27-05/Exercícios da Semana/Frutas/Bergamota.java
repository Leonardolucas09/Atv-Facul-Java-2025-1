package Frutas;
public class Bergamota extends Fruta {
    private int qtdGomos;
    
    public Bergamota() { //Construtor sem parâmetros (default)
        super("laranja", 0);
    }
    
    public Bergamota(String cor, int qtdSementes, int qtdGomos) {
        super(cor = "laranja", qtdSementes);
        this.qtdGomos = qtdGomos;
    }

    @Override
    public void escreve() {
        System.out.println("Sou uma bermagota.");
    }
}
