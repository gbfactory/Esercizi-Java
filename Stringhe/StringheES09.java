package stringhe;

// 10 12 2019

import java.util.Scanner;

public class StringheES09 {

    public static void main(String[] args) {

        // vettore grandezza 256 (tabella ascii)
        final int MAX_CHAR = 256;
        int count[] = new int[MAX_CHAR];

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String str = scan.nextLine();

        // conta i caratteri
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // crea vettore di char lungo come la str
        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int trovato = 0;

            for (int j = 0; j <= i; j++) {

                // se trova riscontro
                if (str.charAt(i) == ch[j]) {
                    trovato++;
                }

            }

            if (trovato == 1) {
                System.out.println("Il carattere " + str.charAt(i) + " appare " + count[str.charAt(i)]);
            }

        }

    }

}
