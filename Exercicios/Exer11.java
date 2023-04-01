package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer11 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        Random random = new Random();
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
            }


        }
        int count = 0;
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] != 0) {
                count++;

                System.out.println("Numeros pares " + i + ":  " + vetorB[i]);
            }


        }
        System.out.println(count);

    }
}
