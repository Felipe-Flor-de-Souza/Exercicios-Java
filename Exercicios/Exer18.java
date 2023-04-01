package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer18 {
    /*18 - Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
    Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
     */
/* esse daqui pedi uma dica pro chatGPT pq nao tava conseguindo associar como montava
a estrutura do codigo
 */
    public static void main(String[] args) {
        int[] vectorA = new int[10];
        Random random = new Random();

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = random.nextInt(100);
        }

        int menorIdade = vectorA[0];
        int menorPos = 0;

        for (int i = 0; i < vectorA.length; i++) {

            if (vectorA[i] < menorIdade) {
                menorIdade = vectorA[i];
                menorPos = i;


            }
            System.out.println("Jovem n°" + i + ": " + vectorA[i]);

        }
        int maiorIdade = vectorA[0];
        int maiorPos = 0;
        for (int i = 0; i < vectorA.length; i++) {

            if (vectorA[i] > maiorIdade) {
                if (vectorA[i] > 75) {


                    maiorIdade = vectorA[i];
                    maiorPos = i;
                }

            }
        }

        System.out.println("A menor idade é " + menorIdade + " na posição " + menorPos);
        System.out.println("A maior idade é " + maiorIdade + " na posição " + maiorPos);
        System.out.println("Esse da posição " + maiorPos + " jesus ja ta levando");
    }
}
