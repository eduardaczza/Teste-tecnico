package Teste.Teste2;

import java.util.Scanner;

public class Interruptores {
        public static void main(String[] args) {
        boolean[] interruptores = new boolean[3];
        boolean[] lampadas = new boolean[3];

        // Primeira visita: ligar e desligar interruptores
        ligarInterruptor(interruptores, 0);
    
        desligarInterruptor(interruptores, 0);
    
        ligarInterruptor(interruptores, 1);

        // Segunda visita: verificar estado das lâmpadas
        lampadas = verificarLampadas();

        // Lógica para determinar qual interruptor controla cada lâmpada
        System.out.println("Resultados:");
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                if (interruptores[i]) {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (quente).");
                } else {
                    System.out.println("O interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (fria, mas ligada recentemente).");
                }
            } else {
                System.out.println("O interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (fria e desligada).");
            }
        }
    }

    public static void ligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = true;
    }

    public static void desligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = false;
    }

    public static boolean[] verificarLampadas() {
        Scanner scanner = new Scanner(System.in);
        boolean[] lampadas = new boolean[3];

        System.out.println("Verifique o estado das lâmpadas e digite 1 (quente) ou 0 (fria):");
        for (int i = 0; i < lampadas.length; i++) {
            System.out.print("Lâmpada " + (i + 1) + ": ");
            lampadas[i] = scanner.nextInt() == 1;
        }

        return lampadas;
        }
    }
    

