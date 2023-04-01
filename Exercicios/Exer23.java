package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

/*23 - Números palíndromos são aqueles que escritos da direita para a
 esquerda têm o mesmo valor quando escritos da esquerda para a direita.
 Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique
 se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja,
 se o primeiro elemento do vetor e igual ao último, se o segundo elemento do
 vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou
 chegar a conclusão que o vetor não é um palíndromo.
 */
public class Exer23 {
    
    public static void main(String[] args){
        int tam=10;
        int [] vetorA = new int [tam];
        Random random = new Random();
        for (int i = 0; i <tam ; i++) {
            vetorA[i]= random.nextInt(10);
            System.out.print(vetorA[i]);

            {
        }


        }

    }    
}
