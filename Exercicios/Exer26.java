package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer26 {
    // Criar um vetorA com 10 elementos inteiros.
    // Construir um vetorB de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    // a) vetorB[i] deverá receber 'a' quando vetorA[i] for menor que 7;
    // b) vetorB[i] deverá receber 'b' quando vetorA[i] for igual a 7;
    // c) vetorB[i] deverá receber 'c' quando vetorA[i] for maior que 7 e menor que 10;
    // d) vetorB[i] deverá receber 'd' quando vetorA[i] for igual a 10; e
    // e) vetorB[i] deverá receber 'e' quando vetorA[i] for maior que 10.
    // Sugestão: char vetorB[10];

    public static void main(String[] args) {
        int [] vetorA = new int[10];
        char[] vetorB = new char[10];

        Random random = new Random();
        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = random.nextInt(11);
            System.out.print(vetorA[i]+ " = " );

            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else {
                vetorB[i] = 'e';

            }
            System.out.print(vetorB[i]);
            System.out.println();
        }
    }

}

