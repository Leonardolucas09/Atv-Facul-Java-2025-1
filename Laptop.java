public class Laptop {
    
    public static int getBattery(int[] eventos) {
        int bateriaAtual = 50;
        
        for (int evento : eventos) { //Laço For-each, já que não vamos trabalhar com o índice.
            if (evento > 0) {
                bateriaAtual += evento;
                if (bateriaAtual > 100) { //Verificação de caso seja maior que 100%.
                    bateriaAtual = 100;
                }
            } else {
                int minutosJogados = Math.abs(evento); //"O laptop consome 1% por minuto. Recuperamos o número absoluto para ter o valor positivo em minutos."

                bateriaAtual -= minutosJogados;
                if (bateriaAtual < 0) { //Verificação de caso seja menor que 0%.
                    bateriaAtual = 0;
                }
            }
        }
        return bateriaAtual;
    }

    public static void main(String[] args) {
        int[] evento = {10, -20, 61, -15};
        int bateriaFinal = getBattery(evento); //Método getBattery é estático para não ter instanciar um objeto.
        System.out.println("Baterial final: " + bateriaFinal + "%");
    }
}
