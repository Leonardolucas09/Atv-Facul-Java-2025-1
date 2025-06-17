public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String cor, int cilindradas) {
        super(placa, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
