package NegocioFormas;
public class Forma {
    private String nome;
    private double area;

    public Forma() {
        this.nome = "Sem forma definida";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calculaArea() {
        System.out.println("Não tenho forma definida.");
    }

    public void exibeDados() {
        System.out.println(nome);
        System.out.println(area);
    }
}
