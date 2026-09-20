package org.example;

import java.util.Scanner;

public class exercicio9 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 9: ");
        int num = sc.nextInt();

        if (num < 1 || num > 9) {
            System.out.println("inválido");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
    }
}
