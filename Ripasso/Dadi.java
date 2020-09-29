import java.util.Random;
import java.util.Scanner;

public class Dadi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quante volte vuoi tirare i dadi?");
        int giocate = scan.nextInt();

        int giocatore1 = 0;
        int giocatore2 = 0;

        for (int i = 0; i < giocate; i++) {
            System.out.println("==============================");
            System.out.println("    GIOCATA N " + (i + 1));
            giocatore1 += lanciaDadi();
            giocatore2 += lanciaDadi();
            System.out.println("==============================");
        }

        System.out.println("==============================");
        if (giocatore1 > giocatore2) System.out.println("Ha vinto il giocatore 1");
        else if (giocatore1 < giocatore2) System.out.println("Ha vinto il giocatore 2");
        else if (giocatore1 == giocatore2) System.out.println("Hanno pareggiato!");
        System.out.println("==============================");
    }

    public static int lanciaDadi() {
        Random rand = new Random();
        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        int somma = dado1 + dado2;

        System.out.println("------------------------------");
        System.out.println("Primo dado: " + dado1);
        System.out.println("Secondo dado: " + dado2);
        System.out.println("Somma: " + somma);
        System.out.println("------------------------------");

        if (dado1 == dado2 ) return somma * 2;
        else return somma;
    }
}
