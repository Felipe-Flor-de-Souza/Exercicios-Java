package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer13 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        Random random = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(21);

            vetorB[i] = vetorA[i] * 5;


            System.out.println("Vetor A : " + vetorA[i]);
            System.out.println("Multiplo de 5 do vetor A: " + vetorB[i]);


        }

    }


}

