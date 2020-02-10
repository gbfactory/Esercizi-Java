/**
 * EREDITARIETA'
 *
 * 10 02 2020
 *
 * SINGOLA          extends     CLASS
 * MULTIPLA         implements  INTERFACCE
 */

package ereditarieta;

import java.util.Scanner;

public class Quadrato {

    private int lato;

    public Quadrato() {
        lato = 0;
    }

    public Quadrato(int l) {
        lato = l;
    }

    /**
     * Metodo stampare il lato del quadrato
     */
    public void visualizza() {
        System.out.println("Il lato del quadrato e': " + lato);
    }

    /**
     * Metodo per calcolare l'area del quadrato
     * @return int
     */
    public int calcolaArea() {
        int area;	// Variabile locale
        area = lato * lato;

        return area;
    }

    /**
     * Metodo per stampare l'area del quadrato
     */
    public void visualizzaArea() {
        System.out.println("L'area e': "+ calcolaArea());
    }

    /**
     * Metodi per inserire il lato del quadrato da imput
     */
    public void inserimento() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci il lato del quadrato: ");
        lato=scan.nextInt();
        while(lato<0) {
            System.out.println("Reinserisci il lato >= 0:");
            lato=scan.nextInt();
        }
    }
}
