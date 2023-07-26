import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        int n = sc.nextInt();
        horas = n / 3600;
        minutos = (n % 3600) / 60;
        segundos = (n % 3600) % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}

// horas = N // 3600
// minutos = (N % 3600) // 60
// segundos = (N % 3600) % 60