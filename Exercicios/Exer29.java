package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

//29 - Ler um vetor A com 20 elementos.
// Construir dois vetores B e C, sendo que nos vetor B e C
// serão armazenados o valores pares e ímpares de A, respectivamente.
public class Exer29 {
    
    public static void main(String[] args){
        int tam = 20;
        int [] vetorA = new int[tam];
        int [] vetorB = new int[tam];
        int [] vetorC = new int[tam];
        int countpar=0;
        int countimpar=0;
        Random random = new Random();
        for (int i = 0; i <tam ; i++) {
            vetorA[i]=random.nextInt(10);
            if (vetorA[i]%2==0){
                vetorB[i]=vetorA[i];
                System.out.println(" Vetor B recebendo par : "+vetorB[i]);
                countpar++;
            }
            else  {
                vetorC[i]=vetorA[i];
                System.out.println(" Vetor C recebendo impar: "+vetorC[i]);
                countimpar++;
            }
        }
        System.out.println("Quantidade de Par : "+countpar);
        System.out.println("Quantidade de Impar : "+countimpar);
    }    
}
