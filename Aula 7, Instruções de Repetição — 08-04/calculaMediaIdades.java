public class calculaMediaIdades {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        
        int media = calculaMediaIdades();
        System.out.println("Média das Idades: " + media);

        int min = t.leInt("Digite a idade mínima: ");
        int max = t.leInt("Digite a idade máxima: ");
    
        int mediaFiltrada = calculaMediaIdades(min, max);
        System.out.println("Média das Idades entre " + min + " e " + max + ": " + mediaFiltrada);
    }

    public static int calculaMediaIdades() {
        int soma = 0;
        int cont = 0;
    
        Teclado t = new Teclado();
        int idade = t.leInt("Digite uma idade (0 interrompe): ");
        while (idade > 0) {
            soma += idade;
            cont++;
            idade = t.leInt("Digite uma idade (0 interrompe): ");
        }
    
        if (cont > 0) {
            return soma / cont;
        } else {
            return 0;
        }
    }

    public static int calculaMediaIdades(int minimo, int maximo) {
        //soma, conta e idade são variáveis locais
        int soma = 0;
        int cont = 0;
        
        Teclado t = new Teclado();
        int idade = t.leInt("Digite uma idade(0 interrompe): ");
        while (idade > 0){
            if (idade >= minimo && idade <= maximo){
                soma = soma + idade;
                cont++;
            }
            idade = t.leInt("Digite uma idade(0 interrompe): ");
        }
        if (cont > 0) { //teste para evitar a divisão por zero
            return soma / cont;
        } else {
            return 0;
        }
    }
}
