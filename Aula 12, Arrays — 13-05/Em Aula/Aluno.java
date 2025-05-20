public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNotas(double n1, double n2, double n3, double n4) {
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4; 
    }    

    public void getMediaNotas() {
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("A média é " + media);
    }
}
