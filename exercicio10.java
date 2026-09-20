package org.example;

import java.util.Scanner;

public class exercicio10 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        double compra = 0.0;
        int itens = 0;

        System.out.println("Caixa");

        while (true) {
            System.out.print("Digite o número (0 encerra): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            System.out.print("Digite o preço unitário: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int qtd = sc.nextInt();

            compra += preco * qtd;
            itens += qtd;
        }

        if (itens == 0) {
            System.out.println("Nenhum produto foi registrado");
        } else {
            System.out.println("Folha de pagamento");
            System.out.println("1 dinheiro (5% de desconto)");
            System.out.println("2 débito (Sem mudança)");
            System.out.println("3 crédito (3% de acréscimo)");
            System.out.print("Escolha a forma de pagamento: ");
            int pagamento = sc.nextInt();

            switch (pagamento) {
                case 1 -> compra = 0.95;
                case 2 -> compra = 1.00;
                case 3 -> compra= 1.03;
                default -> System.out.println("pagamento inválido total sem mudanças");
            }

            if (compra > 300.00) {
                System.out.println("aviso: compra grande");
            }

            if (itens > 20) {
                System.out.println("aviso: muitos itens");
            }

            System.out.println("Total de itens: " + itens);
            System.out.println("Total a pagar: " + compra);
        }

    }
}
