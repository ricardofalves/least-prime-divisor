package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        boolean EndOfInput = true;
        int n;


        while (EndOfInput) {
            line = input.nextLine();

            n = Integer.parseInt(line);

            if (n == 0||n<2||n>100000000) {
                EndOfInput = false;
            } else {

                int resultado = menorDivisor(n);
                System.out.print(resultado);
                line = input.nextLine();

            }
        }
    }

    public static int menorDivisor(int numero) {
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0)
                return i;
        }

        return numero;
    }
}
