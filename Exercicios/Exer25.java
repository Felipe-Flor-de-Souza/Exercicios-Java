package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer25 {

    /*25 - Criar dois vetores A e B cada um com 10 elementos inteiros.
        Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
        a) vetorC[i] deverá receber  1 quando vetorA[i] for maior que vetorB[i];
        b) vetorC[i] deverá receber  0 quando vetorA[i] for igual a   vetorB[i];
        c) vetorC[i] deverá receber -1 quando vetorA[i] for menor que vetorB[i].
         */
    public static void main(String[] args){
        int tam = 10;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];
        int[] vetorC = new int[tam];

        Random random = new Random();
        for (int i = 0; i <tam ; i++) {

            vetorA[i]=random.nextInt(20);
            vetorB[i]=random.nextInt(20);
            vetorC[i]=random.nextInt(20);
            System.out.println("Vetor A antes da condição é : "+vetorA[i]);
            System.out.println("Vetor B antes da condição é : "+vetorB[i]);
            System.out.println("Vetor C antes da condição é : "+vetorC[i]);
            if (vetorA[i]>vetorB[i]){
                vetorC[i]=vetorC[i]+1;
                System.out.println("Vetor A depois da condição ++ é : "+vetorA[i]);
                System.out.println("Vetor B depois da condição ++ é : "+vetorB[i]);
                System.out.println("Vetor C depois da condição ++ é : "+vetorC[i]);

            }
                else if (vetorA[i]==vetorB[i]){
                    vetorC[i]=0;
            }
                //  como nao sabia se eles estavam realmente funcionando,
                //  fiz dessa forma pra ver a cada passada o que mudava

                else {
                    vetorC[i]=vetorC[i]-1;
                System.out.println("Vetor A depois da condição -- é : "+vetorA[i]);
                System.out.println("Vetor B depois da condição -- é : "+vetorB[i]);
                System.out.println("Vetor C depois da condição -- é : "+vetorC[i]);

            }



        }


    }    
}
