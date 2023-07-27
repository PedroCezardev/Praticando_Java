//Programa de leitura e comparação de valores em JAVA.

package programa.leitura.comparacao;

import java.util.Scanner;

public class valores {
    
    public static void main(String[] args) {
        int a, b, c;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        a = dado.nextInt();
        
        System.out.println("Digite um número inteiro: ");
        b = dado.nextInt();
        
        System.out.println("Digite um número inteiro: ");
        c = dado.nextInt();
        
        int soma = a + b;
        
        if (soma < c) {
            System.out.println("A soma de a + b é menor que c. ");
        }else{
            System.out.println("A soma de a + b é maior que c. ");
        } 
    }
}
