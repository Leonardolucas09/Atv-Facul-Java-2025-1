public class JogoPim {
    public void jogoPIM(int multiplo){ //método void responsável pelo jogo, tendo um parâmetro dentro
        for (int i = 1; i <= 50; i++) { //laço FOR responsável por incrementar 1 até 50
            if (i % multiplo == 0) { 
                System.out.println("PIM"); //Printa PIM se for i for múltiplo do valor escolhido
            } else {
                System.out.println(i); //Senão printa o valor normal
            }
        }
    }
    public static void main(String[] args) {
        Teclado t = new Teclado();
        JogoPim jp = new JogoPim();

        int m = t.leInt("\nDigite o múltiplo desejado"); 

        jp.jogoPIM(m);
    }
}
