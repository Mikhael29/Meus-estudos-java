import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Leitura das coordenadas X e Y
            System.out.print("Digite o valor de X: ");
            int x = scanner.nextInt();
            
            System.out.print("Digite o valor de Y: ");
            int y = scanner.nextInt();
            
            // Verifica se pelo menos uma das coordenadas é nula
            if (x == 0 || y == 0) {
                System.out.println("Programa encerrado.");
                break; // Encerra o loop quando uma coordenada nula é inserida
            } else {
                // Determina o quadrante
                if (x > 0 && y > 0) {
                    System.out.println("1º quadrante");
                } else if (x < 0 && y > 0) {
                    System.out.println("2º quadrante");
                } else if (x < 0 && y < 0) {
                    System.out.println("3º quadrante");
                } else if (x > 0 && y < 0) {
                    System.out.println("4º quadrante");
                } else {
                    System.out.println("Origem");
                }
            }
        }
        
        scanner.close();
    }
}
