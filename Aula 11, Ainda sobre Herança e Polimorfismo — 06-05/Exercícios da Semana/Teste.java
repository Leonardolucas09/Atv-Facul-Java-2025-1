public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Programador("Jorge", "0321131213", 321, "Java");
        
        Programador programador;
            if (funcionario instanceof Programador) {
                programador = (Programador)funcionario;
                
                
                System.out.println("[" + programador.getNome() + "] - Linguagem de Programação preferida: " + programador.getLingProgramacao());
            }
        }
    }
