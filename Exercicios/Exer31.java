package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

/*31 - Criar um vetor A com 5 elementos inteiros.
Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
 */
public class Exer31 {
    
    public static void main(String[] args) {
        int tam = 5;

        int[] vetorA = new int[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            vetorA[i] = random.nextInt(10);
            for (int j = 1; j <tam ; j++) {
                System.out.println(vetorA[i]+" x "+j+ " = " + (vetorA[i]*j));

            }




                }

            }
        }
