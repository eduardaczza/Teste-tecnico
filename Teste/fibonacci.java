package Teste;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int n1 = 0, n2 = 1, somaNs = 0;
        
        while (somaNs < numero) {
            somaNs = n1 + n2;
            n1 = n2;
            n2 = somaNs;
        }

        if (somaNs == numero && somaNs == 0){
            System.out.println("O número " + numero + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não faz faz parte da sequência de Fibonacci.");
        }

        scanner.close();
    }
}
