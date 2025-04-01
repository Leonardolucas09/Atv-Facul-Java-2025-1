public class MainMaterial {
    public static void main(String[] args) {
        Material caneta = new Material(23, 20, 7.50, "Caneta");
        Material lapis = new Material(67, 50, 2.50, "Lápis");

        System.out.println("Informações iniciais");
        caneta.exibeDados();
        
        caneta.vender(3);

        lapis.setPreco(2.70);
        
        caneta.adicionarEstoque(10);

        System.out.println("\nApós as vendas");
        caneta.exibeDados();
        lapis.exibeDados();
    }
}
