package org.example;

import java.util.Scanner;

public class exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int nota;

       do {
           System.out.println("Digite um valor de 0 a 10");
           nota = sc.nextInt();

           if (nota < 0 || nota > 10) {
               System.out.println("Valor invalido");
           }
       }  while(nota < 0 || nota >10);

        System.out.println("Valor aceito: " + nota);


    }
}
