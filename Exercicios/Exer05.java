package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer05 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = new Random().nextInt(11);
            vetorB[i] = vetorA[i];

        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");

        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
            System.out.print(vetorB[i] + " ");


        }


    }
}
