//Exercício 1 e 2

public class Caneta {
    private String cor;
    private String marca;
    private double preco;
    private  String ponta;
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setPonta(String ponta){
        this.ponta = ponta;
    }
    
    //Exercício 2
    
    public Caneta(String cor, String marca, String ponta){
        this.cor = cor;
        this.marca = marca;
        this.ponta = ponta;
    }
    
    public void exibeCaneta(){
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Ponta: " + ponta);
    }
}