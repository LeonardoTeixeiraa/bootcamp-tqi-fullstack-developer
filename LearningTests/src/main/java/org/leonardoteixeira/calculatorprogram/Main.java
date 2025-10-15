package org.leonardoteixeira.calculatorprogram;

import org.leonardoteixeira.calculatorprogram.model.Calculator;

import java.sql.Array;
import java.util.*;

public class Main {
    private static final String MAIN_MENU = """
                ===Calculator===
                1 - Sum
                2 - Div
                3 - SquareRoot
                4 - it's Odd
                0 - Out
                Option:
                """;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int op = -1;

        while (op != 0) {
            try {
                System.out.print(MAIN_MENU);
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        handleSum(sc, calculator);
                        break;
                    case 2:
                        handleDivision(sc, calculator);
                        break;
                    case 3:
                        handleSquareRoot(sc, calculator);
                        break;
                    case 4:
                        handleIsOdd(sc, calculator);
                        break;
                    case 0:
                        System.out.print("Saindo");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(500);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 0 e 4.");
                        break;
                }
            }catch (InputMismatchException e){
                System.err.println("Erro de entrada: Por favor, digite um número inteiro para a opção.");
                sc.nextLine();
                op = -1;
            }
        }
        sc.close();
    }
    /*
    * Funções Auxiliares*/
    private static void handleSum(Scanner sc, Calculator calculator) {
        System.out.println("Informe os números para soma, separados por espaço (Ex: 10.5 5 20):");

        try {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Resultado da soma: 0.0");
                return;
            }

            String[] tokens = line.split("\\s+");

            double[] numbers = Arrays.stream(tokens)
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double result = calculator.sum(numbers);
            System.out.printf("Resultado da soma: %.2f%n", result);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Informe números em formato válido");
        }
    }

    private static void handleDivision(Scanner sc, Calculator calculator) {
        try {
            System.out.print("Numero 1: ");
            int numerator = sc.nextInt();
            System.out.print("Numero 2: ");
            int divisor = sc.nextInt();

            sc.nextLine();

            int result = calculator.div(numerator, divisor);
            System.out.printf("Resultado da divisão inteira: %d%n", result);

        } catch (InputMismatchException e) {
            System.err.println("Os número informado devem ser inteiros");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de cálculo: " + e.getMessage());
        }
    }

    private static void handleSquareRoot(Scanner sc, Calculator calculator) {
        try {
            System.out.print("Informe o número (double): ");
            double number = sc.nextDouble();
            sc.nextLine();

            double result = calculator.squareRooot(number);
            System.out.printf("Resultado da raiz quadrada: %.4f%n", result);

        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada: Por favor, digite um número válido (double).");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de cálculo: " + e.getMessage());
        }
    }

    private static void handleIsOdd(Scanner sc, Calculator calculator) {
        try {
            System.out.print("Informe o número para verificar se é impar");
            int number = sc.nextInt();
            sc.nextLine();

            boolean result = calculator.isOdd(number);
            String isOddMessage = result ? "É ímpar" : "É par";
            System.out.printf("O número %d %s%n", number, isOddMessage);

        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite um número inteiro.");
            sc.nextLine();
        }
    }
}
