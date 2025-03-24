public class ContaBancaria {
    private int numero;
    private int agencia;
    private String titular;
    private double saldo = 0;
    
    public ContaBancaria(int numero, int agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public void imprimirInfosConta() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual R$: " + saldo);
    }
}