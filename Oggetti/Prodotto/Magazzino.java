package prodotto;

import java.util.Scanner;

public class Magazzino {

    public static void main(String[] args) {

        /* ESEMPI

        // 5 Creare un prodotto P1 con il costruttore di default
        Prodotto P1 = new Prodotto("12345", "Prodotto molto bello", 3, 5);

        // 6 Aggiungere 10 pezzi al prodotto
        P1.aggiungi(10);

        // 7 Visualizzare le informazioni del prodotto
        P1.printAll();

        // 8 Creare un prodotto P2 con inserimento da input
        Prodotto P2 = new Prodotto();

        P2.inputCodice();
        P2.inputDescrizione();
        P2.inputQuantita();
        P2.inputScorta();

        // 9 Eliminare da P2 un certo numero di pezzi richiesti dall'input
        P2.inputRimuovi();

         */

        // 10 Creare un magazzino come vettore di N prodotti
        Scanner scan = new Scanner(System.in);

        int dimScan;
        do {
            System.out.println("Inserisci il numero di prodotti: ");
            dimScan = scan.nextInt();
        } while (dimScan <= 0);
        int dim = dimScan;

        Prodotto prodotto[] = new Prodotto[dim];

        // 11 Inserire dall'input le informazioni sui prodotti
        for (int i = 0; i < dim; i++) {
            prodotto[i].inputAll();
        }

        // 12 Visualizzare le info su tutti i prodotti
        for (int i = 0; i < dim; i++) {
            prodotto[i].printAll();
        }

        // 13 Visualizzare dati da codice
        System.out.println("Inserisci il codice:");
        String inputCodice = scan.next();

        int i = 0;
        boolean found = false;
        while (i < dim && !found) {
            if (prodotto[i].getCodice().equalsIgnoreCase(inputCodice)) {
                prodotto[i].printAll();
                found = true;
            }
            i++;
        }

        // 14 Visualizzare prodotto da descrizione
        System.out.println("Inserisci parte della descrizione ");
        String descInput = scan.nextLine();

        i = 0;
        found = false;
        while (i < dim && !found) {
            if (prodotto[i].getDescrizione().contains(descInput)) {
                prodotto[i].printAll();
                found = true;
            }

        }

    }

}
