package figuraGeometrica;

import java.util.Scanner;

/**
 * Classe quadrato
 *
 * @author gbfactory
 * @version 2.0
 * @since 14/01/2020
 */

public class Quadrato extends FiguraGeometrica {

    // **************************************************
    // Attributi
    // **************************************************

    private int lato;


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore predefinito
     */
    public Quadrato() {
        lato = 0;
    }

    /**
     * Costruttore con parametri
     * @param l Lato del quadrato
     */
    public Quadrato(int l) {	// l = 2	l variabile locale
        lato = l;
    }


    // **************************************************
    // Metodi
    // **************************************************

    /**
     * Imposta il lato del quadrato
     * @param l Lato del quadrato
     */
    public void setLato (int l) {
        lato = l;
    }

    /**
     * Restituisce il lato del quadrato
     * @return Lato del quadrato
     */
    public int getLato () {
        return lato;
    }

    /**
     * Inserisci lato
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);
        int l;
        do {
            System.out.println("Inserisci il lato: ");
            l = scan.nextInt();
        } while (l < 0);
        setLato(l);
    }

    /**
     * Visualizza il lato del quadrato
     */
    public void visualizza() {
        System.out.println("---= QUADRATO =---");
        System.out.println("Il lato del quadrato e': " + lato);
    }

    /**
     * Calcola e restituisce l'area del quadrato
     * @return Area del quadrato
     */
    public int calcolaArea() {
        int area;	// Variabile locale
        area = lato * lato;

        return area;
    }

}