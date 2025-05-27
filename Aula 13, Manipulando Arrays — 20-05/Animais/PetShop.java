public class PetShop {
    private Animal[] lista; //Criamos uma lista do tipo Animal
    private int totalItens = 0;

    public PetShop() {
        this.lista = new Animal[8];  //Setamos a lista com 8 animais
    }

    public void adicionar(Animal a) {
        if (isListaCheia()) {
            System.out.println("Lista cheia.");
        } else {
            lista[totalItens] = a;
            totalItens++;
        }
    }

    public boolean isListaCheia() {
        return totalItens == lista.length;
    }

    public int getTotalPeixes() {
        int total = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Peixe) {
                total++;
            }
        }
        return total;
    }

    public int getTotalCachorros() {
        int total = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Cachorro) {
                total++;
            }
        }
        return total;
    }
}
