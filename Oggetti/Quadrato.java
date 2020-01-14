package oggetti;/*
 * Descrizione: classe quadrato
 * Autore: Cognome nome
 * Data: 14 01 2020
 * Versione: 0.1
 */

public class Quadrato {

    // Attributi

    // Attributi privati -> private
    // Possono essere utilizzati solo all'interno della classe
    // Metodi pubblici -> public
    // Possono essere usati ovunque
    private int lato;	// Dichiarazione lato quadrato

    // Costruttori

    /* Costruttore di default: inizializza l'oggetto
       con valori standard
       - Stesso nome della classe
       - Non ha tipo di dato o void
       - Non restituisce niente
    */
    public Quadrato() {
        lato = 0;
    }

    /* Costruttore 2 con un parametro: passo il lato (int)
       Si chiama OVERLOADING DEI METODI: quando ci sono
       metodi con lo stesso nome ma parametri diversi
     */
    public Quadrato(int l) {	// l = 2	l variabile locale
        lato = l;
    }

    // Metodi

    // Visualizza il lato del quadrato
    public void visualizza() {
        System.out.println("Il lato del quadrato e': " + lato);
    }

    // Calcola l'area del quadrato
    // Restituisce l'area del quadrato
    public int calcolaArea() {
        int area;	// Variabile locale
        area = lato * lato;

        return area;
    }

    // Main trasferito in Main.java

}
