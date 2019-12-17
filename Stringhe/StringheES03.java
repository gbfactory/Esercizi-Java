package stringhe;

// 06 12 2019

import java.util.Scanner;

public class StringheES03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa");
            String stringa = scan.nextLine();
            if (stringa.equalsIgnoreCase("stop")) {
                System.out.println("Ti sei fermato!");
                break;
            } else {
                System.out.println("Hai inserito: \"" + stringa + "\"");
            }
        }

    }

}
