package org.example;

import java.util.Scanner;

public class exercicio7 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de aluno: ");
        int alunos = sc.nextInt();

        if (alunos <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            double notas = 0.0;
            int aprovado = 0;
            int reprovado = 0;

            for (int i = 1; i <= alunos; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = sc.nextDouble();

                notas += nota;

                if (nota >= 6.0) {
                    aprovado++;
                } else {
                    reprovado++;
                }
            }

            double media = notas / alunos;

            System.out.println("Média da turma: " + media);
            System.out.println("Alunos com nota maior ou igual a 6: " + aprovado);
            System.out.println("Alunos com nota abaixo de 6: " + reprovado);
        }

    }
}
