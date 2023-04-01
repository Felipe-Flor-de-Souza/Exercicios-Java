package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

/*21 - Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
A[i] = (int)Math.round(Math.random() * 1);
Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes
no vetor A.
 */
public class Exer21 {

    public static void main(String[] args) {
        int qntd = 10;
        int count0 = 0;
        int count1 = 0;
        int[] vetorA = new int[qntd];
        Random random = new Random();
        for (int i = 0; i < qntd; i++) {
            vetorA[i] = random.nextInt(2);
            if (vetorA[i] % 2 == 1) {
                count0++;

                System.out.println(vetorA[i]);
            } else {
                System.out.println(vetorA[i]);
                count1++;
            }

        }
        System.out.printf("Numero 0 : %d%% \n", (count0 * 100 / vetorA.length));
        System.out.printf("Numero 1 : %d%% ", (count1 * 100 / vetorA.length));


    }
}
