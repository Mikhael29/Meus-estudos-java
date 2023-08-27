import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        boolean condicao_1 = b > c;
        boolean condicao_2 = d > a;
        boolean condicao_3 = c + d > a + b;
        boolean condicao_4 = c > 0 && d > 0;
        boolean condicao_5 = a % 2 == 0;

        if (condicao_1 && condicao_2 && condicao_3 && condicao_4 && condicao_5) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();

    }
}