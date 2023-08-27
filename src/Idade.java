import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idadeDias = sc.nextInt();
        int anos, meses, dias;

        if (idadeDias == 365) {
            anos = 1;
            meses = 0;
            dias = 0;
        } else if (idadeDias == 30) {
            anos = 0;
            meses = 1;
            dias = 0;

        } else {
            anos = idadeDias / 365;
            int restoDias = idadeDias % 365;
            meses = restoDias / 30;
            dias = restoDias % 30;
        }

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
