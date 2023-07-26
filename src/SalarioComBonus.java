import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vendedor;

        double salariofixo, totaldevendas, valortotal, porcentagem;
        double total;

        vendedor = sc.nextLine();
        salariofixo = sc.nextDouble();
        totaldevendas = sc.nextDouble();
        porcentagem = 15;

        valortotal = (porcentagem / 100.0) * totaldevendas;
        total = valortotal + salariofixo;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String totalFormatado = decimalFormat.format(total);

        System.out.println("TOTAL = R$ " + totalFormatado);

        sc.close();

    }
}