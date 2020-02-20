package agenziaImmobiliare;

/**
 * Agenzia Immobiliare classe main
 *
 * @author gbfactory
 * @version 1.0
 * @since 19/02/2020
 */

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vector<Immobile> agenzia = new Vector(1, 1);

        while (true) {
            System.out.println("========================");
            System.out.println("MENU OPERAZIONI");
            System.out.println("1 - Inserisci un appartamento");
            System.out.println("2 - Inserisci un negozio");
            System.out.println("3 - Cerca immobili inferiori a prezzo");
            System.out.println("4 - Aggiorna la superficie di un immobile");
            System.out.println("5 - Cancella un immobile");
            System.out.println("========================");

            int op = scan.nextInt();

            scan.nextLine();        //per scaricare il buffer di tastiera

            if (op == 1) {
                // inserimento appartamento
                Appartamento a = new Appartamento();
                a.inserisci();
                agenzia.add(a);

            } else if (op == 2) {
                // inserimento negozio
                Negozio n = new Negozio();
                n.inserisci();
                agenzia.add(n);

            } else if (op == 3) {

                System.out.println("Inserisci prezzo massimo");
                double przMax = scan.nextDouble();

                for (Immobile i : agenzia) {
                    if (i.getPrezzo() < przMax) {
                        i.visualizza();
                    }
                }

                scan.nextLine();

            } else if (op == 4) {

                System.out.println("Inserisci cognome e nome proprietario");
                String cnInput = scan.nextLine();
                String[] cnSplit = cnInput.split("\\s+");
                System.out.println("Inserisci indirizzo");
                String indInput = scan.nextLine();

                for (Immobile i : agenzia) {
                    if (i.getCognome().equalsIgnoreCase(cnSplit[0]) && i.getNome().equalsIgnoreCase(cnSplit[1]) && i.getIndirizzo().equalsIgnoreCase(indInput)) {

                        if (i instanceof Appartamento) {        //se è un appartamento
                            System.out.println("=> STAI AGGIORNANDO UN APPARTAMENTO");

                            System.out.println("Inserisci la nuova superficie:");
                            double sup = scan.nextDouble();
                            ((Appartamento) i).setSuperficie(sup);

                        } else if (i instanceof Negozio) {     // set è un negozio
                            System.out.println("=> STAI AGGIORNANDO UN NEGOZIO");

                            System.out.println("Inserisci la nuova superficie del negozio:");
                            double supNeg = scan.nextDouble();
                            ((Negozio) i).setSuperficieNegozio(supNeg);

                            System.out.println("Inserisci la nuova superficie del magazzino:");
                            double supMag = scan.nextDouble();
                            ((Negozio) i).setSuperficieMagazzino(supMag);

                        }
                    }
                }

                scan.nextLine();

            } else if (op == 5) {

                System.out.println("Inserisci cognome e nome proprietario");
                String cnInput = scan.nextLine();
                String[] cnSplit = cnInput.split("\\s+");
                System.out.println("Inserisci indirizzo");
                String indInput = scan.nextLine();

                agenzia.removeIf(i -> i.getCognome().equalsIgnoreCase(cnSplit[0]) && i.getNome().equalsIgnoreCase(cnSplit[1]) && i.getIndirizzo().equalsIgnoreCase(indInput));

            } else {
                break;
            }

        }

    }

}
