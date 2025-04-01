public class Material {
    private int codigo, qtdEstoque;
    private String nome;
    private double preco;

    public Material(int codigo, int qtdEstoque, double preco, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void adicionarEstoque(int qtdEstoque) {
        if (qtdEstoque > 0) {
            this.qtdEstoque += qtdEstoque;
            System.out.println(qtdEstoque + " unidades de " + nome + " foram adicionaas ao estoque");
        } else {
            System.out.println("A quantidade deve ser maior que zero.");
        }
    }

    public void vender(int qtdEstoque) {
        if (qtdEstoque > 0 && this.qtdEstoque >= qtdEstoque){
            this.qtdEstoque -= qtdEstoque;
            System.out.println(qtdEstoque + " unidades de " + nome + " foram vendidas.");
        } 
        
        else if (qtdEstoque <= 0) {
            System.out.println("A quantidade de venda deve ser maior que zero.");
        } else {
            System.out.println("Estoque esgotado para " + nome + "!");
        }
    }

    public void exibeDados() {
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
        System.out.println("Quantidade no Estoque: " + qtdEstoque);
    }
}
