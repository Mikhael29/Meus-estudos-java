import java.util.Scanner;

public class Esfera {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, calculo;

        raio = scanner.nextDouble();
        calculo = (4.0 / 3.0) * 3.14159 * raio * raio * raio;
        System.out.printf("VOLUME = %.3f%n", calculo);

        scanner.close();
    }
}
