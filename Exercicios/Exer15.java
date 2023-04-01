package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer15 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        Random random = new Random();
        int countimp = 0;
        int countpar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(11);
            vetorB[i] = random.nextInt(11);
            if (vetorA[i] % 2 == 1) {
                countimp++;
            } else {
                countpar++;

            }

        }
        System.out.printf("Impar: %d%% ", (countimp * 100) / vetorA.length);
        System.out.printf("\nPar: %d%% ", (countpar * 100) / vetorA.length);

    }
}
