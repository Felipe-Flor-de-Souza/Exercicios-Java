package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

/*22 - Criar um vetor A com 10 elementos inteiros.
Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares.
Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor deve ser encerrado,
como sugestão: utilize uma variável do tipo flag para atingir este propósito.
 */
public class Exer22 {

    public static void main(String[] args) {
        int qntd = 10;
        int[] vetorA = new int[qntd];
        Random random = new Random();

        for (int i = 0; i < qntd; i++) {
            vetorA[i] = random.nextInt(10);
        }

        for (int i = 0; i < qntd; i++) {

            if (vetorA[i] % 2 != 0) {
                break;
            }
            System.out.println("Indicador de Par " + vetorA[i]);
        }
    }
}

