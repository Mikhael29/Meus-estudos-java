import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        int escolha;

        System.out.println("Calculadora Simples");
        System.out.println("===================");

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Selecione a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Escolha: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
