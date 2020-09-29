import java.util.Random;
import java.util.Scanner;

public class Indovina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            indovinaNumero();
            System.out.println("Vuoi giocare ancora? [Y]es [N]o");
            if (scan.nextLine().toLowerCase().equals("n")) break;
        }
    }

    public static void indovinaNumero() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int tentativi  = 0;
        int random = rand.nextInt(99) + 1;

        System.out.println("Il computer ha generato un numero...");

        while (true) {
            System.out.println("Prova ad indovinarlo... ");
            int tentativo = scan.nextInt();
            tentativi++;

            if (tentativo < random) System.out.println("Numero troppo piccolo!");
            else if (tentativo > random) System.out.println("Numero troppo grande!");
            else {
                System.out.println("Bravo! Hai indovinato in " + tentativi + " tentativi!");
                break;
            }
        }
    }
}
