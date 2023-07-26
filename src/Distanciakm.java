import java.util.Scanner;

public class Distanciakm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância (em km) que o carro Y precisa tomar do carro X: ");
        double distancia = scanner.nextDouble();
        
        double velocidadeRelativa = 90 - 60; // Velocidade relativa do carro Y em relação ao carro X
        
        double tempoEmMinutos = (distancia / velocidadeRelativa) * 60;
        
        System.out.println( tempoEmMinutos + " %.2f%n minutos.");
        
        scanner.close();
    }
}
