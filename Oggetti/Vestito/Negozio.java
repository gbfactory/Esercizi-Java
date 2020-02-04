package vestiti;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Negozio {

    public static void main(String[] args) {


        // 2.A Creare un vestito vest1 utilizzando il costruttore di default
        Vestito vest1 = new Vestito();

        // 2.A Assegnare a vest1
        vest1.setMarca("Benetton");
        vest1.setModello("Primavera Uomo");
        vest1.setTaglia("M");
        vest1.setQuantita(40);
        vest1.setPrezzo(25.00);

        // Visualizza le informazioni sul vest1
        System.out.println("==================\n" + vest1.toString() + "\n==================");

        // 2.B Creare un vestito vest 2 utilizzando il costruttore con parametri
        Vestito vest2 = new Vestito("Nike", "Sport1", "L", 25, 46.00);

        // Visualizza le informazioni sul vest2
        System.out.println("==================\n" + vest2.toString() + "\n==================");

        // 2.B Scontare il vestito del 5% e visualizzare il prezzo scontato
        vest2.sconto(5);
        System.out.println(vest2.getPrezzo());

        // 2.C Vendere 10 capi del vest1
        vest1.vende(10);


        // Dichiarazione vettore TODO: problema selezione operazioni senza aver prima creato il vettore
        final int DIM = 300;    // Dimensione dell'array
        Vestito negozio[] = new Vestito[DIM];   // Dichiarazione array

        // Menu (non richiesto)
        while (true) {

            System.out.println("==================");
            System.out.println("MENU OPERAZIONI DISPONIBILI");
            System.out.println("1) Inserisci i vestiti");
            System.out.println("2) Visualizza i vestiti con prezzo maggiore di 100");
            System.out.println("3) Visualizza i vestiti sottoscorta con q di 10");
            System.out.println("4) Sconta tutti i capi del 30%");
            System.out.println("===> SELEZIONA OPERAZIONE ");
            Scanner scan = new Scanner(System.in);
            int op = scan.nextInt();
            scan.nextLine();

            if (op == 1) {
                // 3.A Creare un vettore di 300 vestiti inseriti dall'input
                for (int i = 0; i < DIM; i++) {
                    System.out.println("==================");
                    System.out.println("Stai inserendo il vestito numero " + i);
                    negozio[i] = new Vestito();     // Dichiara un nuovo vestito
                    negozio[i].inputAll();      // Inserisce tutti i dati del vestito
                }
            } else if (op == 2) {
                // 3.B Visualizzare i vestiti con prezzo maggiore di 100
                System.out.println("==================");
                System.out.println("Vestiti con prezzo maggiore di 100");
                for (int i = 0; i < DIM; i++) {
                    if (negozio[i].getPrezzo() > 100.0) {
                        System.out.println("==================");
                        System.out.println(negozio[i].toString());
                    }
                }
            } else if (op == 3) {
                // 3.C Visualizzare i vestito in sottoscorta con quantita 10
                System.out.println("==================");
                System.out.println("Vestiti sottoscorta (Q 10)");
                for (int i = 0; i < DIM; i++) {
                    if (negozio[i].sottoScorta(10)) {
                        System.out.println("==================");
                        System.out.println(negozio[i].toString());
                    }
                }
            } else if (op == 4) {
                // 3.D Scontare tutti i capi del 30%
                for (int i = 0; i < DIM; i++) {
                    negozio[i].sconto(30);
                }
                System.out.println("==================");
                System.out.println("Tutti i capi sono stati scontati del 30%");
            } else if (op == 5) {
                // 3.E
                System.out.println("I");

            } else {
                break;
            }

        }

    }

}
