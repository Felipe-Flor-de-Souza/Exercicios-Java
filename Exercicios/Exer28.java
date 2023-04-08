package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer28 {


    /*28 - Ler dois vetores A e B com 10 elementos cada.
    Construir um vetor C, sendo este a junção dos dois outros vetores.
    Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B.
    Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
     */
    public static void main(String[] args) {
        int tam = 10;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];
        int[] vetorC = new int[vetorA.length + vetorB.length]; //definindo o tamanho para nao dar out of bounds
        Random random = new Random();

        for (int i = 0; i < tam; i++) {
            vetorA[i] = random.nextInt(10);
            System.out.print(" A:" +vetorA[i]);
            vetorB[i] = random.nextInt(10);

        }

        for (int i = 0; i < tam; i++) {
            System.out.print(" B:" +vetorB[i]);

            vetorC[i]= vetorA[i];
            //vetorC na posição i é igual ao vetorA
            vetorC[i+tam]=vetorB[i];
            //^ vetorC recebe posição i + o tamanho que foi atribuido para o comprimento do array
            // e atribuindo ao vetorB, para que o vetorC receba o vetorB
        }
        System.out.println(" ");
        for (int i = 0; i <vetorC.length ; i++) {
            //aqui foi arrumado pra imprimir os numeros do vetorC em baixo dos outros para melhor entendimento
            System.out.print("  " +vetorC[i] + " ");


        }

    }
}





