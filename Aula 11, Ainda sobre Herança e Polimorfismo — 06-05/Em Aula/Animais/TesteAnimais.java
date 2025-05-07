package Animais;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal a; 
        a = new Gato("Frajola", 2);
        a.respirar();
        a.falar();
        Gato g;
        // a.lamberCauda();
        if (a instanceof Gato) {
            g = (Gato)a;
            g.lamberCauda();
        }
    }
}
