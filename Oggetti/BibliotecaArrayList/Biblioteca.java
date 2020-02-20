package bibliotecaNuova;

/**
 * Biblioteca Main con ArrayList
 *
 * @author gbfactory
 * @version 2.0
 * @since 20/02/2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Libro> biblio = new ArrayList<Libro>();

        while (true) {
            System.out.println("========================");
            System.out.println("MENU OPERAZIONI");
            System.out.println("1 - Inserire le informazioni di un libro");
            System.out.println("2 - Visualizzare la biblioteca");
            System.out.println("3 - Visualizzare le informazioni di un libro dato il codice ISBN");
            System.out.println("4 - Eliminare un libro dato il codice ISBN");
            System.out.println("5 - Visualizzare l'autore del libro La Divina Commedia");
            System.out.println("6 - Visualizzare i libri che hanno un prezzo compreso tra due valori inseriti");
            System.out.println("7 - Visualizzare i libri di Informatica");
            System.out.println("8 - Visualizzare i libri con il prezzo più alto");
            System.out.println("========================");

            int op = scan.nextInt();

            scan.nextLine();        //per scaricare il buffer di tastiera

            if (op == 1) {
                // inserire un libro
                Libro l = new Libro();  // creazione libro
                l.inserisci();          // inserimento libro
                biblio.add(l);          // aggiunta del libro al vector
            } else if (op == 2) {
                // visualizzare la biblioteca
                for (Libro l : biblio) {
                    l.visualizza();
                }
            } else if (op == 3) {
                // visualizzare libro dato codice isbn
                System.out.println("Inserisci il codice ISBN: ");
                String input = scan.nextLine();
                for (Libro l : biblio) {
                    if (l.getIsbn().equalsIgnoreCase(input)) {
                        l.visualizza();
                        break;
                    }
                }
            } else if (op == 4) {
                // rimuove libro dato codice isbn
                System.out.println("Inserisci il codice ISBN: ");
                String input = scan.nextLine();
                for (Libro l : biblio) {
                    if (l.getIsbn().equalsIgnoreCase(input)) {
                        biblio.remove(l);
                        break;
                    }
                }

                //biblio.removeIf(l -> l.getIsbn().equalsIgnoreCase(input));      // https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html#removeIf-java.util.function.Predicate-
            } else if (op == 5) {
                for (Libro l : biblio) {
                    if (l.getTitolo().equalsIgnoreCase("La Divina Commedia")) {
                        System.out.println(l.getAutore());
                        break;
                    }
                }
            } else if (op == 6) {
                System.out.println("Inserisci il primo valore");
                int valMin = scan.nextInt();
                System.out.println("Inserisci il secondo valore");
                int valMax = scan.nextInt();

                if (valMax < valMin) {         // Se il valore massimo è maggiore del minimo vengono scambiati
                    int temp = valMax;
                    valMax = valMin;
                    valMax = temp;
                }

                for (Libro l : biblio) {
                    if (l.getPrezzo() >= valMin && l.getPrezzo() <= valMax) {
                        l.visualizza();
                    }
                }
            } else if (op == 7) {
                for (Libro l : biblio) {
                    if (l.getArgomento().equalsIgnoreCase("Informatica")) {
                        l.visualizza();
                    }
                }
            } else if (op == 8) {

                double przMax = 0;

                // cerca il prezzo maggiore
                for (Libro l : biblio) {
                    if (l.getPrezzo() > przMax) {
                        przMax = l.getPrezzo();
                    }
                }

                // visualizza il libro con quel prezzo
                for (Libro l : biblio) {
                    if (l.getPrezzo() == przMax) {
                        l.visualizza();
                    }
                }
            } else {
                break;
            }

        }

    }




}
