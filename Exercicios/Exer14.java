package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer14 {


    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int res = 0;
        Random random = new Random();
        int count = 0;


        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(21);
            if (vetorA[i] % 2 == 1) {
                count++;
                res += vetorA[i];
                System.out.println(vetorA[i]);
            }
        }
        System.out.println("Total : " + res);
        System.out.println("Media : " + res / count);
        System.out.println("Numeros Totais :" + count);
    }
}
