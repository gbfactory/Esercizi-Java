package ereditarieta;

/**
 * Classe Quadrato (ereditarietà)
 * @author gbfactory
 * @date 10 02 2020
 */

import java.util.Scanner;

/*
 * SINGOLA          extends     CLASS
 * MULTIPLA         implements  INTERFACCE
 */

public class Quadrato {

    private int lato;

    /**
     * Costruttore di default con lato = 0
     */
    public Quadrato() {
        lato = 0;
    }

    /**
     * Costruttore con lato passato come parametri
     * @param l
     */
    public Quadrato(int l) {
        lato = l;
    }

    /**
     * setLato
     * @param lato
     */
    public void setLato(int lato) {
        this.lato = lato;
    }

    /**
     * getLato
     * @return int
     */
    public int getLato() {
        return this.lato;
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
     * Metodo per visualizzare il lato del quadrato
     */
    public void visualizza() {
        System.out.println("Il lato del quadrato e': " + lato);
    }


    /**
     * Metodo per visualizzare l'area del quadrato
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

    /**
     * Metodo tostring
     * @return String
     */
    public String toString() {
        String s = "";
        s += "\n" + getLato();

        return s;
    }

    /**
     * Metodo per controllare se due quadrati sono uguali
     * @param q
     * @return boolean
     */
    public boolean equals(Quadrato q) {
        if (this.getLato() == q.getLato()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo per comparare due quadrati
     * @param q
     * @return int
     */
    public int compareTo(Quadrato q) {
        if (this.lato == q.lato) {
            return 0;
        } else if (this.lato > q.lato) {
            return 1;
        } else {
            return -1;
        }
    }

}
