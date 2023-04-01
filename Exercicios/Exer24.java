package modulo02.Felipe_Souza.aula01_arrays.labs;

import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        /* 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        String numeroString = Integer.toString(numero);
        StringBuilder reverso = new StringBuilder(numeroString).reverse();
        
        if (numeroString.equals(reverso.toString())) {
            System.out.println("O número é um palíndromo.");
        } else {
            System.out.println("O número não é um palíndromo.");
        }
        */
       /* Integer[] num = {3,5,4,3};
        int count=0;
        for(int i = 0 ; i< num.length/2 ; i++){

            for(int j = num.length-1 ; j>=num.length/2 ; j--){

                if(num[i]==num[j]){
                    count++;
                }
            }
        }
        
        //System.out.println(count);
        if(count == num.length/2){
            for (Integer numero:num) {
                System.out.print(numero);
            }
            System.out.println(": é palíndromo");
            
        }else{

            for (Integer numero:num) {
                System.out.print(numero);
            }
            System.out.println(": nao é palíndromo");

        }*/
    
    String felipe ="Felipe";
    StringBuilder epilef =new StringBuilder(felipe).reverse();
    StringBuilder palavra = new StringBuilder();
    palavra.append(felipe);
    palavra.append(" ");
    palavra.append(epilef);
    String palavrafundida= palavra.toString();//essa aqui ele converte em string, o string builder nao é um string, é uma classe pra manipular strings
    //concatenou as duas strings q tavam declaradas e um espaço e depois convertou em uma string e armazenou ali no palavra fundida
    //mas e so pra tu ver q tem varias funçoes programadas la na classe nao é pra entender as vzs tu ta com curiosidade pra ver o q tem la ai aperta control e clica na classe
    //aquele ali era o append q a gente tava usando, ele recebe uma string e bota na frente
    //mas o q tu vai acabar usando é aquela dali do reverse só tem q saber q vai inverter a string, mas se pa tu pode usar a variavel como uma string tambem sem problemas, elas sao 
    //da mesma classe principal 
    System.out.println("Felipe normal: "+felipe);
    System.out.println("Felipe ao contrario: "+epilef);
    System.out.println(palavrafundida);//variavel string
    System.out.println(palavra);//variavel stringbuilder
    /*
    for (int i = felipe.length()-1; i >=0; i--) {
        System.out.print(felipe.charAt(i));
    }
    */
    

}
    
}

