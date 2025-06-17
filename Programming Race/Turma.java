public class Turma {
    private Aluno[] alunos;

    public Turma(int tamanho) {
        this.alunos = new Aluno[tamanho];
    }

    public void adicionaAluno(Aluno a, int posicao) {
        if (posicao < 0 || posicao >= this.alunos.length) {
            System.out.println("ERRO. Posição " + posicao + " está fora dos limites do array.");
            return;
        }

        if (this.alunos[posicao] == null) {
            this.alunos[posicao] = a;
            System.out.println("Aluno " + a.getNome() + " adicionado na posição " + posicao + ".");
        }
    }

    public Aluno getMaiorNota() {
        Aluno AlunoMaiorNota = null;
        double maiorNota = -1.0;

        for (int i = 0; i < alunos.length; i++) {
            if (this.alunos[i] != null) {
                if (AlunoMaiorNota == null || this.alunos[i].getNota() > maiorNota) {
                    maiorNota = this.alunos[i].getNota();
                    AlunoMaiorNota = this.alunos[i];
                }
            }
        }
        System.out.println("\nNome: " + AlunoMaiorNota.getNome() + " | Nota: " + AlunoMaiorNota.getNota());
        return AlunoMaiorNota;
    }

    public double getMediaNotas() {
        int alunosValidos = 0;
        double somaNotas = 0.0;

        for (int i = 0; i < alunos.length; i++) {
            if (this.alunos[i] != null) {
                somaNotas += this.alunos[i].getNota();
                alunosValidos++;
            }
        }

        if (alunosValidos == 0.0) {
            return 0.0;
        }
        return somaNotas / alunosValidos;
    }

    public void exibeNotas() {
        System.out.println("\n=====Lista de Alunos e Notas da Turma=====");
        
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] != null) {
                System.out.println("Aluno: " + alunos[i].getNome() + " | Nota: " + alunos[i].getNota());
            } else {
                System.out.println("Posição: " + i + " esta vazia...");
            }
        }
    }
}
