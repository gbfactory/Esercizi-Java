package figuraGeometrica;

/**
 * Classe rettangolo
 *
 * @author gbfactory
 * @version 2.0
 * @since 16/01/2020
 */

import java.util.Scanner;

public class Rettangolo extends FiguraGeometrica {

    // **************************************************
    // Attributi
    // **************************************************

    private int base;
    private int altezza;


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore predefinito
     */
    public Rettangolo() {
        base=0;
        altezza=0;
    }

    /**
     * Costruttore con parametri
     * @param b Base del rettangolo
     * @param a Area del rettangolo
     */
    public Rettangolo(int b, int a) {
        base=b;
        altezza=a;
    }


    // **************************************************
    // Metodi
    // **************************************************

    /**
     * Imposta la base del rettangolo
     * @param b Base del rettangolo
     */
    public void setBase(int b) {
        base = b;
    }

    /**
     * Imposta l'altezza del rettangolo
     * @param a Altezza del rettangolo
     */
    public void setAltezza(int a) {
        altezza = a;
    }

    /**
     * Restituisce la base del rettangolo
     * @return Base del rettangolo
     */
    public int getBase() {
        return base;
    }

    /**
     * Restituisce l'altezza del rettangolo
     * @return Altezza del rettangolo
     */
    public int getAltezza() {
        return altezza;
    }

    /**
     * Inserisci i dati del rettangolo
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);

        int b;
        do {
            System.out.println("Inserisci la base: ");
            b = scan.nextInt();
        } while (b < 0);
        setBase(b);

        int a;
        do {
            System.out.println("Inserisci l'altezza: ");
            a = scan.nextInt();
        } while (a < 0);
        setBase(a);
    }

    /**
     * Visualizza la base del rettangolo
     */
    public void visualizzaBase() {
        System.out.println("La base e' : " + base);
    }

    /**
     * Visualizza l'altezza del rettangolo
     */
    public void visualizzaAltezza() {
        System.out.println("L'altezza e' : " + altezza);
    }

    /**
     * Visualizza tutti i dati del rettangolo
     */
    public void visualizza() {
        System.out.println("---= RETTANGOLO =---");
        visualizzaBase();
        visualizzaAltezza();
        visualizzaArea();
        visualizzaPerimetro();
    }

    /**
     * Calcola l'area del rettangolo
     * @return Area del rettangolo
     */
    public int calcoloArea() {
        int area=base*altezza;	//area -> variabile locale (vive solo li' dentro)
        return area;
    }

    /**
     * Visualizza area del rettangolo
     */
    public void visualizzaArea() {
        System.out.println("L'area e': " + calcoloArea());
    }

    /**
     * Calcola perimetro del rettangolo
     * @return Perimetro del rettangolo
     */
    public int calcoloPerimetro() {
        int perimetro=2*(base+altezza);
        return perimetro;
    }

    /**
     * Visualizza perimetro del rettangolo
     */
    public void visualizzaPerimetro() {
        System.out.println("Il perimetro e' : " + calcoloPerimetro());
    }

}