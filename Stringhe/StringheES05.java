package stringhe;

// 06 12 2019

import java.util.Scanner;

public class StringheES05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String stringa = scan.nextLine();

        if (stringa.endsWith("?")) {
            System.out.println("Non saprei...");
        } else if (stringa.endsWith("!")) {
            System.out.println("Hai proprio ragione!");
        } else {
            System.out.println("Mmmm, non mi convince...");
        }

    }
}
