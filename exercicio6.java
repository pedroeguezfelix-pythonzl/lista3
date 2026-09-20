package org.example;

import java.util.Scanner;

public class exercicio6 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("inválido");
        } else {
            long fator = 1;

            for (int i = 1; i <= n; i++) {
                fator *= i;
            }

            System.out.println("Fator de " + n + " é: " + fator);
        }

    }
}
