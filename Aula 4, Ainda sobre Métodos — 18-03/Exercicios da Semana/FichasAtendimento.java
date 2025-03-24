public class FichasAtendimento{
    private int qtdClientes = 0;
    
    public void adicionarCliente(){
       qtdClientes++;     
    }
    
    public void atenderCliente(){
        qtdClientes--;
    }
    
    public int getQtdClientes(){
        return qtdClientes;
    }
    
    public boolean verificarFilaVazia(){
        return qtdClientes == 0;
    }
    
    public void imprimeTamanhoFila(){
        System.out.println("Atualmente na lista há " + qtdClientes + " cliente(s).");
    }
}