package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Random;

/*20 - Implementar um programa que obtenha a cotação do dólar (U$)
em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
 */
public class Exer20 {

    public static void main(String[] args) {
        int qntd = 20;
        double[] real = new double[qntd];
        double[] dolar = new double[qntd];
        Random random = new Random();

        for (int i = 0; i < real.length; i++) {
            real[i] = random.nextDouble() * (1000 - 1) + 1;

            System.out.printf("Valor do Real (R$) antes da conversão : %.2f\n", real[i]);

            System.out.printf("Após conversão em Dolar (U$)          : %.2f\n", (dolar[i] = real[i] * 5.34));
        }


    }
}
