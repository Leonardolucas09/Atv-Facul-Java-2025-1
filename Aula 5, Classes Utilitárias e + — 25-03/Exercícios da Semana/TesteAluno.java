import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        // Entrada do primeiro aluno
        System.out.print("Digite o nome do primeiro aluno: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a nota 1: ");
        double nota1_1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2_1 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3_1 = scanner.nextDouble();

        Aluno aluno1 = new Aluno(nome1, nota1_1, nota2_1, nota3_1);

        // Entrada do segundo aluno
        System.out.print("\nDigite o nome do segundo aluno: ");
        scanner.nextLine(); // limpar buffer antes de ler o nome
        String nome2 = scanner.nextLine();
        System.out.print("Digite a nota 1: ");
        double nota1_2 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2_2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3_2 = scanner.nextDouble();

        Aluno aluno2 = new Aluno(nome2, nota1_2, nota2_2, nota3_2);
    
        // Exibição do relatório
        System.out.println("\n================= RELATÓRIO DE NOTAS =================");
        System.out.printf("%-20s %-6s %-6s %-6s %-6s\n", "Nome do Aluno", "N1", "N2", "N3", "Média");
        System.out.printf("%-20s %6.2f %6.2f %6.2f %6.2f\n", aluno1.getNome(), aluno1.getNota1(), aluno1.getNota2(), aluno1.getNota3(), aluno1.calcularMedia());
        System.out.printf("%-20s %6.2f %6.2f %6.2f %6.2f\n", aluno2.getNome(), aluno2.getNota1(), aluno2.getNota2(), aluno2.getNota3(), aluno2.calcularMedia());


        scanner.close();
    }
}