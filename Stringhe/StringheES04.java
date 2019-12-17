package stringhe;

// 06 12 2019

import java.util.Scanner;

public class StringheES04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String stringa = scan.nextLine();

        int mid = stringa.length()/2;

        System.out.println(mid);

        String stHalf = stringa.substring(0, mid);
        String ndHalf = stringa.substring(mid, stringa.length());

        System.out.println(stHalf + "\n" + ndHalf);

    }

}
