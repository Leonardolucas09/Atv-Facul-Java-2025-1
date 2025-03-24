public class Pedido {
    private double valorTotal;
    private int totalItens;
    
    public Pedido(){
        this.valorTotal = 0;
        this.totalItens = 0;
    }
    
    public void adicionarItem(double valorUnitario, int qtd){
        double valorAdicionado = valorUnitario * qtd;
        this.valorTotal += valorAdicionado;
        this.totalItens += qtd;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public int getTotalItens(){
        return totalItens;
    }
    
    public void imprimirResumoConta(){
        System.out.println("Valor total: R$" + String.format("%.2f", valorTotal));
        System.out.println("Total itens: " + totalItens);
    }
}