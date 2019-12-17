package stringhe;

// 06 12 2019

import java.util.Scanner;

public class StringheES06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String stringa1 = scan.nextLine();

        System.out.println("Inserisci un'altra stringa");
        String stringa2 = scan.nextLine();

        int comp = stringa1.compareToIgnoreCase(stringa2);

        if (comp == 0) {
            System.out.println("Le due stringhe sono uguali");
        } else {
            if (comp > 0) {
                System.out.println("La prima stringa è maggiore");
            } else {
                System.out.println("La seconda stringa è maggiore");
            }
        }

        System.out.println("Primo carattere della prima stringa --> " + stringa1.charAt(0));

        System.out.println("Ultimo carattere della seconda stringa --> " + stringa2.charAt(stringa2.length() - 1));

    }

}
