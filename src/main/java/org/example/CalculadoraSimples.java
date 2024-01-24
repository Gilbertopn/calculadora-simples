package org.example;

import java.util.Scanner;

public class CalculadoraSimples {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Calculadora Simples");
            System.out.print("Informe o primeiro valor: ");
            double num1 = scanner.nextDouble();

            System.out.print("Informe o segundo valor: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha sua operação   | (+) Para adição | (-) Para Subtração | (*) Para multiplicação | (/) Para divisão | : ");
            char operation = scanner.next().charAt(0);

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Não pode ser dividido por 0.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            System.out.println("Resultado: " + result);
        }
    }
