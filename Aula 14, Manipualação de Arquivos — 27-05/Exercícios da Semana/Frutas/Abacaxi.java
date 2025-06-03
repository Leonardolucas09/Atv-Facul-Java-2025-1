package Frutas;
public class Abacaxi extends Fruta {
    private String variedade;
    
    public Abacaxi(String cor, int qtdSementes) { //Construtor sem parâmetro (default)
        super("amarelo", 0);
        this.variedade = "pérola";
    }
    
    public Abacaxi(String cor, String variedade, int qtdSementes) {
        super(cor, qtdSementes);
        this.variedade = variedade;
    }


    public void escreve() {
        System.out.println("Eu sou um abacaxi.");
    }

}
