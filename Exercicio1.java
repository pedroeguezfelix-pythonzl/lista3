package org.example;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me fale um numero? ");
        int n = sc.nextInt();

        if(n  <1){
            System.out.println("Não a valores a exibir");
        } else {
            int contador = 1;
            while (contador<= n){
                System.out.println("contador");
                contador++;
            }
        }




    }
}