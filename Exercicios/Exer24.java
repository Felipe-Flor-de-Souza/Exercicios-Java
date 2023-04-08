package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        scan.close();
        
        String numeroString = Integer.toString(numero);
        StringBuilder reverso = new StringBuilder(numeroString).reverse();
        
        if (numeroString.equals(reverso.toString())) {
            System.out.println("O número é um palíndromo.");
        } else {
            System.out.println("O número não é um palíndromo.");
        }
    }
    
}


