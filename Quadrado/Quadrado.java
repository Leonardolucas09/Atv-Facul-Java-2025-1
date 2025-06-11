package Outros;

public class Quadrado {
    /*
        caso o parâmetro lado informado seja menor que 1, não deve ser desenhado o quadrado e a seguinte mensagem deve ser exibida: 
        “Informe um número maior ou igual a 1.”
     */

    public static void desenhaQuadradoAsteriscos(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }  
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    public static void desenhaQuadradoChar(int lado, char simbolo) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    System.out.print(simbolo + " ");
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    public static void desenhaQuadradoDiagonalDescendente(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    if (l == c) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    public static void desenhaQuadradoDiagonais(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    if (l == c || l + c == lado -1) {
                        System.out.print("*");
                    }
                    // else if (l + c == lado -1) {
                    //     System.out.print("* ");
                    // }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    public static void desenhaQuadradoTrianguloNaoSeiComoFizIsso(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < (lado - l); c++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < l; a++) {
                    System.out.print("* ");
                }   
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    /*Não consegui realizar este exercício */
    public static void desenhaQuadradoTrianguloInferior(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < (lado - l); c++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < l; a++) {
                    System.out.print("* ");
                }   
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    public static void desenhaQuadradoLinhasImpares(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    if (l % 2 == 0) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero mair ou igual a 1.");
        }
    }

    public static void desenhaQuadradoColunasImpares(int lado) {
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {
                    if (c % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

    /*Não consegui realizar este exercício */
    public static void desenhaQuadradoLinhasColunasAlternadas(int lado){
        if (lado > 1) {
            for (int l = 0; l < lado; l++) {
                for (int c = 0; c < lado; c++) {    

                    boolean linhaParEColunaPar = (l % 2 == 0 && c % 2 == 0);
                    boolean linhaImparEColunaImpar = (l % 2 != 0 && c % 2 != 0);

                    if (linhaParEColunaPar || linhaImparEColunaImpar) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.err.println("Informe um numero maior ou igual a 1.");
        }
    }

}
