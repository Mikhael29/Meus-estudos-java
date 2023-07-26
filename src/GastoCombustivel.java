import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciaTotal, velocidadeMediakm, tempoTotal;
        double litroGasolina = 12;
        double resultado;

        tempoTotal = sc.nextInt();
        velocidadeMediakm = sc.nextInt();

        distanciaTotal = velocidadeMediakm * tempoTotal;
        resultado = distanciaTotal / litroGasolina;

        System.out.printf(" %.3f%n", resultado);

        sc.close();

    }

}
