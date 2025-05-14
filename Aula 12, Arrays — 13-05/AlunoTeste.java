public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jorginho", "23123");
        aluno.setNotas(6, 9, 8, 3);
        aluno.getMediaNotas();
    }
}
