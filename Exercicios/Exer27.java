package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Long.reverse;

//27 - Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos de A,
// sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B,
// o segundo elemento de A passa a ser o penúltimo de B e assim por diante.
public class Exer27 {
    public static void main(String[] args) {


        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite algum numero : ");
            vetorA[i]=sc.nextInt();


            while (vetorA[i] !=0){
                // extrai o dígito menos significativo do número original
                int digito = vetorA[i] % 10;

                // adiciona o dígito extraído no reverso
                vetorB[i] = vetorB[i] * 10 + digito;

                // remove o dígito extraído do número original
                vetorA[i] /= 10;
            }

            System.out.println("O reverso do numero digitado é: " + vetorB[i]);


        }
    }
}