package org.example;

import java.util.Scanner;

public class exercicio8 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        int soma = 0;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.print("Digite um valor (0 encerra): ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            while (num != 0) {
                qtd++;
                soma += num;

                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }

                System.out.print("próximo valor (0 encerra): ");
                num = sc.nextInt();
            }

            System.out.println("Quantidade de valores: " + qtd);
            System.out.println("Soma: " + soma);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
    }
}

