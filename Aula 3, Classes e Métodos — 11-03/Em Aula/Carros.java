public class Carros{
    private String placa;
    private double consumoMedio;
    private double nivelTanque;
    
    public Carros(String placa, double consumoMedio){
        this.placa = placa;
        this.consumoMedio = consumoMedio;
        
        this.nivelTanque = 0;
    }
    
    public void exibeCarros() {
        System.out.println("Placa: " + placa);
        System.out.println("Consumo Médio: " + consumoMedio);
        System.out.println("Nível de Tanque: " + nivelTanque);

    }
}