package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        boolean EndOfInput = true;
        int n;


        while (EndOfInput) {
            System.out.println("\nDigite um número maior que 2 e menor que 100000000");
            line = input.nextLine();
            n = Integer.parseInt(line);

            if (n == 0) {
                System.out.println("Encerrando o programa");
                EndOfInput = false;

            } else {
                int resultado = menorDivisorPrimo(n);
                System.out.printf(String.valueOf(resultado));
            }
        }
    }

    public static int menorDivisorPrimo(int numero) {
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0)
                return i;
        }
        return numero;
    }
}
