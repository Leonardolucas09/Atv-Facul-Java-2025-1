package Pessoas;

import java.util.Random;

public class PessoaTeste {
    public static Pessoa[] getPessoasPorAltura(Pessoa[] lista, double altura) {
        int totalPessoas = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getAltura() > altura) {
                totalPessoas++;
            }
        }

        Pessoa [] listaRetorno = new Pessoa[totalPessoas];

        int posicao = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getAltura() > altura) {
                listaRetorno[posicao] = lista[i];
                posicao++;
            }
        }

        return listaRetorno;
    }

    public static void main(String[] args) {
        Random gerador = new Random();

        Pessoa[] listaPessoas = new Pessoa[20];

        double altura;
        for (int i = 0; i < listaPessoas.length; i++) {
            altura = gerador.nextDouble(0.5) + 1.5;
            listaPessoas[i] = new Pessoa("Jorge", altura);
        }

    altura = 1.7;
    System.out.println("Pessoas que tem altura maior que " + altura);
    Pessoa[] resposta = PessoaTeste.getPessoasPorAltura(listaPessoas, 1.7);

        for (int i = 0; i < resposta.length; i++) {
            System.out.println(i + " " + resposta[i].getAltura());
        }
    }
}
