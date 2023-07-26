import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        y = 2002;
        System.out.println("Digite a senha:");
        
        do {
            x = sc.nextInt();
            if (x != y) {
                System.out.println("Senha incorreta! Digite novamente:");
            }
        } while (x != y);

        System.out.println("Acesso permitido");
        sc.close();
    }
}
