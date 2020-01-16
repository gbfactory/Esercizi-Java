package oggetti;/*
 * Descrizione: classe rettangolo
 * Autore: Giacomo Brochin
 * Data: 15 01 2020
 * Versione: 0.1
 */

public class Rettangolo {

    // Attributi
    private int base;
    private int altezza;

    // Costruttori
    public Rettangolo() {
        base = 0;
        altezza = 0;
    }

    public Rettangolo(int b, int a) {
        base = b;
        altezza = a;
    }

    // Metodi
    public void visualizzaLati() {
        System.out.println("La base del quadrato è " + base + " e l'altezza è " + altezza);
    }

    // Calcola l'area del rettangolo
    public int calcolaArea() {
        int area;	// Variabile locale
        area = base * altezza;
        return area;
    }

}
