package stringhe;

// 03 12 2019

import java.util.Scanner;

public class StringheES02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String parola1 = scan.next();

        System.out.println("Inserisci un'altra parola");
        String parola2 = scan.next();

        if (parola1.equalsIgnoreCase(parola2)) {
            System.out.println("Sono uguali!");
        } else {
            System.out.println("Non sono uguali!");
        }

    }

}
