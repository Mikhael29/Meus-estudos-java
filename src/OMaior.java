import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0)  {
            System.out.println(a +" sao multiplos de " + b);
        } 
        else {
            System.out.println(a + " nao sao multiplos de " + b);
        }

        sc.close();

       

    }
}