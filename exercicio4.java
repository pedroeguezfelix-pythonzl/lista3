package org.example;

import java.util.Scanner;

public class exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 Dobro");
            System.out.println("2 Metade");
            System.out.println("3 Quadrado");
            System.out.println("0 Sair");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("Digite um número: ");
                    int numero = sc.nextInt();
                    System.out.println("O dobro é: " + (numero * 2));
                    break;
                }


                case 2: {
                    System.out.println("Digite um numero: ");
                    double numero = sc.nextInt();
                    System.out.println("A metade é: " + (numero / 2));
                    break;
                }

                case 3: {
                    System.out.println("Digite um numero: ");
                    int numero = sc.nextInt();
                    System.out.println("O quadrado é: " + (numero * numero));
                    break;
                }
                case 0: {
                    System.out.println("voçe esta SAINDO");
                    break;
                }
                default: {
                    System.out.println("Opção invalida");
                    break;
                }


            }
        } while (opcao != 0) ;
    }
}
