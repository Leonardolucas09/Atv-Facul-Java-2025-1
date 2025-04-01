public class Biblioteca {
    public static void main(String[] args) {
        Livros l1 = new Livros(7228, "Jogador Número 1");
        l1.exibeDados();
        
        l1.retira();
        l1.exibeDados();
        
        l1.retira();
        
        l1.devolve();
        l1.exibeDados();
    }
}
