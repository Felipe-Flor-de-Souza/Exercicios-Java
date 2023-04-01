package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer17 {
    /*17 - Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
     Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.
     */

    public static void main(String[] args) {
        int tam = 10;
        int count = 0;
        int[] vectorA = new int[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            vectorA[i] = random.nextInt(65);
            if (vectorA[i] >= 35) {
                count++;
                System.out.println("Jovem " + count + " : " + vectorA[i]);
            }
        }
        System.out.println("Total de pessoas acima de 35  : " + count);
    }
}
