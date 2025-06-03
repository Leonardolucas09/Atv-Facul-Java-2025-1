package Frutas;
public class Fruta{
    private String cor;
    private int qtdSementes;
    
    public Fruta(String cor, int qtdSementes){
        this.cor = cor;
        this.qtdSementes = qtdSementes;
    }
    
    public void escreve(){
    System.out.println("Sou uma fruta.");
    }
}
