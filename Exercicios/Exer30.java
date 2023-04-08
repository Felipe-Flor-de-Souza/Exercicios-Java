package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer30 {
    //30 - Ler um vetor A com 20 elementos.
    // Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B.
    // Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.
    public static void main(String[] args){
        int tam = 20;
        int [] vetorA = new int[tam];
        int [] vetorB = new int[tam];
        Random random = new Random();
        for (int i = 0; i <tam ; i++) {
            vetorA[i]=random.nextInt(50);
            if (vetorA[i]%2==1){
                vetorB[i]=vetorA[i];
                System.out.println(" Vetor A recebendo Impar : "+vetorB[i]);

            }
            else  {
                vetorB[i]=vetorA[i];
                System.out.println(" Vetor B recebendo Par: "+vetorB[i]);


               }

            }




    }    
}
