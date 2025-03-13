public class ContaBancaria{
    private int numero;
    private double saldo;
    
    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibeContaBancaria() {
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}