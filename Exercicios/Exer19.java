package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

public class Exer19 {

    public static void main(String[] args) {
        int tam = 10;

        float[] nota1 = new float[tam];
        float[] nota2 = new float[tam];
        float[] result = new float[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            nota1[i] = random.nextFloat() * 10;
            nota2[i] = random.nextFloat() * 10;
            result[i] = (nota1[i] + nota2[i]) / 2;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.printf("A media do aluno %d é %.2f ", (i + 1), result[i]);
            if (result[i] >= 7.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");

            }
        }
    }
}

