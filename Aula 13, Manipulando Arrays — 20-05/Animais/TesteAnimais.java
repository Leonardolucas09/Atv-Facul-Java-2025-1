public class TesteAnimais {
    public static void main(String[] args) {
        PetShop pet = new PetShop();
        Cachorro c1 = new Cachorro("Border Collie", 15, 15);
        Cachorro c2 = new Cachorro("Poodle", 12, 18);
        Peixe p1 = new Peixe("Dourado", 6, 2);
        Peixe p2 = new Peixe("Blobfish", 10, 3);

        pet.adicionar(c1);
        pet.adicionar(c2);
        pet.adicionar(p1);
        pet.adicionar(p2);

        System.out.println("Total de Cachorros " + pet.getTotalCachorros());
        System.out.println("Total de Peixes " + pet.getTotalPeixes());
        
    }
}
