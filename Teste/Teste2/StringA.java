package Teste.Teste2;

import java.util.Scanner;

public class StringA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String texto = scanner.nextLine();

        int cont = 0;
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);

            if (letra == 'a' || letra =='A'){
                cont++;
            }
        }

        System.out.println("A letra A aparece " + cont + " vezes na palavra");

        scanner.close();
    }

}
