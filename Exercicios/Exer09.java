package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer09 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];
        Random random = new Random();
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(21);
            vetorB[i] = random.nextInt(21);
            vetorC[i] = (double) vetorA[i] / vetorB[i];
            System.out.println("\nVetor A é : " + vetorA[i] + " Vetor B é : " + vetorB[i]);
            System.out.printf("Vetor C é %.2f:", vetorC[i]);
        }

    }
}
