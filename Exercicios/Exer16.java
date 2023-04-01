package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer16 {
    /* 16 - Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
    a) a soma de elementos armazenados neste vetor que são inferiores a 15;
    b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
    c) a média dos elementos armazenados no vetor que são superiores a 15.*/

    public static void main(String[] args) {
        int tamanho = 10;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int res = 0;
        int total = 0;
        int count = 0;
        int countmedia = 0;
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetorA[i] = random.nextInt(50);
            System.out.println(vetorA[i]);

            if (vetorA[i] < 15) {
                res = res + vetorA[i];


            } else if (vetorA[i] == 15) {
                count++;
            } else if (vetorA[i] > 15) {
                countmedia++;
                total = total + vetorA[i];

            }
        }
        System.out.println("soma dos elementos menores que 15: " + res + "\nelementos iguais a 15 : " + count + "\nmedia dos elementos maior que 15:  " + total / countmedia);
    }
}
