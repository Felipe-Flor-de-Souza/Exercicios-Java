package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer07 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        Random random = new Random();
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(21);
            vetorB[i] = random.nextInt(21);

            vetorC[i] = vetorB[i] - vetorA[i];

            System.out.println("------------ Vetor A " + vetorA[i]);
            System.out.println("------------ Vetor B " + vetorB[i]);
            System.out.println("Subtração do vetor A e B é : " + vetorC[i] + " ");

        }

    }
}
