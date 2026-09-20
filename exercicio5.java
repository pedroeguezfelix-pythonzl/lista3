package org.example;

import java.util.Scanner;

public class exercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Digite o valor de B:  ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("inválido O valor de A não pode ser maior que valor de B");
        } else {
            int somar = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    somar += i;
                }
            }

            System.out.println("Soma dos números: " + somar);
        }

    }
}


