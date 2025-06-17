public class Carro extends Veiculo{
    private int portas;
    private int marchas;

    public Carro(String placa, String cor, int portas, int marchas) {
        super(placa, cor);
        this.portas = portas;
        this.marchas = marchas;
    }

    public int getPortas() {
        return portas;
    }

    public int getMarchas() {
        return marchas;
    }
}
