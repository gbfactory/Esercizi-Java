package stringhe;

// 10 12 2019

import java.util.Scanner;

public class StringheES10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String str1 = scan.nextLine();

        System.out.println("Inserisci un'altra stringa");
        String str2 = scan.nextLine();

        String common = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    common = common + str1.charAt(i);
                }
            }
        }

        System.out.println(common);

    }

}
