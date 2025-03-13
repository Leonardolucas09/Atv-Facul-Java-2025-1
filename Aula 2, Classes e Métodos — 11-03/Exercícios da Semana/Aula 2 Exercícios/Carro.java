public class Carro{
    private String placa;
    private double consumoMedio;
    private double nivelTanque;

    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setConsumoMedio(double consumoMedio){
        this.consumoMedio = consumoMedio;
    }
    
    public void setNivelTanque(double nivelTanque){
        this.nivelTanque = nivelTanque;
    }
    
    public void exibeCarro(){
        System.out.println("Placa: " + placa);
        System.out.println("Consumo Médio: " + consumoMedio);
        System.out.println("Nível do Tanque: " + nivelTanque);
    }
}
