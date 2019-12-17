package stringhe;

// 09 12 2019

import java.util.Scanner;

public class StringheES07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0;

        final int DIM = 3;
        String a[] = new String[DIM];

        System.out.println("=========================================");
        System.out.println("+        INSERISCI GLI STUDENTI         +");
        System.out.println("=========================================");

        while (i < DIM) {
            System.out.println("Inserisci \"Cognome Nome Classe\"");
            a[i] = scan.nextLine();
            i++;
        }

        System.out.println("=========================================");
        System.out.println("+   STUDENTI COGNOME CHE INIZIA CON M   +");
        System.out.println("=========================================");

        for (i = 0; i < DIM; i++) {
            if (a[i].startsWith("M")) {
                System.out.println(a[i]);
            }
        }

        System.out.println("=========================================");
        System.out.println("+    STUDENTI DELLA CLASSE DELLA 3AI    +");
        System.out.println("=========================================");

        for (i = 0; i < DIM; i++) {
            int n = a[i].indexOf(" ", a[i].indexOf(" ") + 1);
            String res = a[i].substring(n + 1, a[0].length() - 1);

            if (res.equalsIgnoreCase("3AI")) {
                System.out.println(a[i].substring(0, a[i].length() - 4));
            }
        }

    }

}
