import java.util.Scanner;

public class Quadrato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int num = scan.nextInt();
        int ris = 1;
        int tot = 1;

        for (int i = 1; i < num; i++) {
            ris += 2;
            tot += ris;
        }

        System.out.println("Il quadrato di " + num + " è " + tot);

    }
}
