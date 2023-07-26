import java.math.BigDecimal;
import java.util.Scanner;

public class Cedula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal valor = sc.nextBigDecimal();
        sc.close();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        BigDecimal[] moedas = { BigDecimal.ONE, BigDecimal.valueOf(0.5), BigDecimal.valueOf(0.25),
                BigDecimal.valueOf(0.10), BigDecimal.valueOf(0.05), BigDecimal.valueOf(0.01) };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtdNotas = valor.divide(BigDecimal.valueOf(nota)).intValue();
            System.out.printf("%d nota(s) de R$ %d.00\n", qtdNotas, nota);
            valor = valor.subtract(BigDecimal.valueOf(qtdNotas).multiply(BigDecimal.valueOf(nota)));
        }

        System.out.println("MOEDAS:");
        for (BigDecimal moeda : moedas) {
            int qtdMoedas = valor.divide(moeda).intValue();
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda);
            valor = valor.subtract(moeda.multiply(BigDecimal.valueOf(qtdMoedas)));
        }
    }
}
