//Programa de análise de números ímpar ou par.

package com.mycompany.mavenproject1;


import java.util.Scanner;
        
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = dado.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número "+ numero + " é impar.");
        }else{
            System.out.println("O número " + numero + " é par.");
        }
        dado.close();
    }
}
