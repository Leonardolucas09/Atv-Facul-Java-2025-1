public class CirculoTest {
    public static void main(String[] args) {   
        Circulo circulo = new Circulo(18);
        
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println("Diâmetro: " + circulo.getDiametro());
        System.out.println("Volume: " + circulo.getVolume());
    }
}