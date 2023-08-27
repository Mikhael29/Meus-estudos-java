import java.util.Scanner;

public class FormulaDeBhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        double discriminante = B * B - 4 * A * C;

        if (discriminante < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);

            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }

        sc.close();
    }
}
