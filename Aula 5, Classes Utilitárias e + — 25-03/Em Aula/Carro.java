public class Carro {
    private String placa;
    private double consumoMedio;
    private double nivelTanque;
    
    public Carro(String placa, double consumoMedio){
        this.placa = placa;
        this.consumoMedio = consumoMedio;
    }
    
    public void abastece(double litros) {
        this.nivelTanque += litros;
    }
    
    public void anda(double distancia) {
        double litrosGastos = distancia / this.consumoMedio;
        this.nivelTanque -= litrosGastos;
        
        if (nivelTanque < 0) {
            this.nivelTanque = 0;
            System.out.println("Sem Combustível!🐱‍👤");
        }
        
        else {
            System.out.println("Veículo Andando");
        }
    }    
    
    public void imprimeNivelTanque(){
        System.out.println("Imprime nivel do tanque: " + nivelTanque);
    }
    
}