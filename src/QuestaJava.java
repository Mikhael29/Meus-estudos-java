import java.util.Scanner;

public class QuestaJava {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A, B, soma;

    System.out.println("Digite o valor de A");
    A = sc.nextInt();
    System.out.println("digite o valor de B");
    B = sc.nextInt();
    soma = A + B;
    System.out.println("Soma = " + soma);

    sc.close();

  }
}