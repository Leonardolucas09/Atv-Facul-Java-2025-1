public class Revenda {
    private Veiculo[] listaVeiculos;
    private int posicoes;

    public Revenda(int tamanho) {
        if (tamanho <= 0) {
            System.out.println("O tamanho deve ser maior que 0.");
            return;
        }

        this.listaVeiculos = new Veiculo[tamanho];
        posicoes = 0;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (v == null) {
            System.out.println("Não é possível adicionar um veículo nulo.");
            return;
        }

        if (posicoes < this.listaVeiculos.length) {
            this.listaVeiculos[posicoes] = v;
            System.out.println("Veículo " + v.getPlaca() + " | de cor " + v.getCor() + " foi registrado na posição: " + posicoes + ".");
        } else {
            System.out.println("Revenda lotada!");
        }
    }

    public int getTotalVeiculos(String cor) {
        if (cor == null) {
            System.out.println("Cor inválida.");
            return 0;
        }

        int contador = 0;

        for (int i = 0; i < posicoes; i++) {
            if (this.listaVeiculos[i] != null && this.listaVeiculos[i].getCor().equalsIgnoreCase(cor)) {
                contador++;
            }
        }
        return contador;
    }

    public int getTotalCarros() {
        int contadorCarros = 0;
        
        for (int i = 0; i < posicoes; i++) {
            if (this.listaVeiculos[i] != null && this.listaVeiculos[i] instanceof Carro) {
                contadorCarros++;
            }
        }
        return contadorCarros;
    }

    public int getTotalMotos(int cilindradasMinimas) {
        if (cilindradasMinimas < 0) {
            System.out.println("Cilindrada mínima não pode ser negativa.");
            return 0;
        }

        int contadorMotos = 0;

        for (int i = 0; i < posicoes; i++) {
            if (this.listaVeiculos[i] != null && this.listaVeiculos[i] instanceof Moto) {
                Moto motoAtual = (Moto) this.listaVeiculos[i];
            
                if (motoAtual.getCilindradas() >= cilindradasMinimas) {
                    contadorMotos++;
                }
            }
        }
        return contadorMotos;
    }
}
