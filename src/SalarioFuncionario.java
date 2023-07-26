import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFuncionario {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTrabalhadas, valorHoras, salario;
        int numero;
 
        numero = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorHoras = sc.nextDouble();
        salario = horasTrabalhadas * valorHoras; 
        
        System.out.println("NUMBER = " + numero);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String salarioFormatado = decimalFormat.format(salario);
        System.out.println("SALARY = U$ " + salarioFormatado);

        sc.close();
    }
}
