public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno (String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    /*public Aluno (String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }*/

    /*public void setNome(String nome) {
        this.nome = nome;
    }*/

    public void setNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibirDados() {
        System.out.println("\nNome do aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
        

    }
}
