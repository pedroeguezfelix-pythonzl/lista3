package org.example;

import java.util.Scanner;

public class exercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me fale um numero: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= 10)
        {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
