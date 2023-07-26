import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double raio = scanner.nextDouble();

        double area = 3.14159 * raio * raio;
        double area2 = Math.PI * raio * raio;

        scanner.close();
      
    }
}
