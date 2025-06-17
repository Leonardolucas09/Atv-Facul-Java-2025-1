public class TurmaTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jorge", 9);
        Aluno a2 = new Aluno("Cecilia", 10);
        Aluno a3 = new Aluno("Simone", 4);
        Aluno a4 = new Aluno("Peralta", 3);
        Aluno a5 = new Aluno("Cris", 8);

        Turma t1 = new Turma(5);
        t1.adicionaAluno(a1, 0);
        t1.adicionaAluno(a2, 1);
        t1.adicionaAluno(a3, 2);
        t1.adicionaAluno(a4, 3);
        t1.adicionaAluno(a5, 4);
        
        t1.getMaiorNota();

        System.out.println("\nMédia da Turma: " + t1.getMediaNotas());
        t1.exibeNotas();
    }
}
