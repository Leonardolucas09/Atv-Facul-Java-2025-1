public class Retangulo{
    private double base = 5.0;
    private double altura = 3.0;
    private double area = 0.0;

    public Retangulo(double base, double altura, double area){
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void exibeRetangulo(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
