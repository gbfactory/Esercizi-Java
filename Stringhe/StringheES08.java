package stringhe;

// 06 12 2019

import java.util.Scanner;

public class StringheES08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String psw = "EuganeoRTV";
        int i = 0;

        while (true && i < 3) {
            System.out.println("Inserisci la password");
            String pswIn = scan.next();
            if (pswIn.equals(psw)) {
                System.out.println("Password corretta");
                break;
            } else {
                i++;
            }
        }

        if (i == 3) {
            System.out.println("Password non corretta");
        }



    }

}
