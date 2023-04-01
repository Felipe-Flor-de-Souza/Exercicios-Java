package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer12 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        Random random = new Random();
        int count = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(21);
            vetorB[i] = random.nextInt(vetorA.length);
            vetorC[i] = vetorA[i] + vetorB[i];
            count++;
            System.out.println(count + "\nVetor A " + vetorA[i]);
            System.out.println("Vetor B " + vetorB[i]);
            System.out.println("Soma dos Vetores " + vetorC[i]);


        }

    }
}
