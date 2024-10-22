package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[100];
        int contador = 0;

        while (true) {
            System.out.println("\nGerenciador de Notas");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Calcular média");
            System.out.println("3. Exibir notas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                if (contador < 100) {
                    System.out.print("Digite a nota: ");
                    notas[contador] = scanner.nextDouble();
                    contador++;
                    System.out.println("Nota adicionada com sucesso!");
                } else {
                    System.out.println("Limite de notas atingido.");
                }
            } else if (escolha == 2) {
                if (contador > 0) {
                    double soma = 0;
                    for (int i = 0; i < contador; i++) {
                        soma += notas[i];
                    }
                    double media = soma / contador;
                    System.out.printf("Média das notas: %.2f\n", media);
                } else {
                    System.out.println("Nenhuma nota cadastrada.");
                }
            } else if (escolha == 3) {
                if (contador > 0) {
                    System.out.println("Notas cadastradas:");
                    for (int i = 0; i < contador; i++) {
                        System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
                    }
                } else {
                    System.out.println("Nenhuma nota cadastrada.");
                }
            } else if (escolha == 4) {

                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}