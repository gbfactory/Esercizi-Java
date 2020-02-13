package figuraGeometrica;

/**
 * Classe rettangolo
 *
 * @author gbfactory
 * @version 2.0
 * @since 19/01/2020
 */

import java.util.Scanner;

public class Cerchio extends FiguraGeometrica {

    // **************************************************
    // Attributi
    // **************************************************

    private int raggio;


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore di default
     */
    public Cerchio() {
        raggio = 0;
        // se dichiaro int raggio = 0 -> scope resolution, la variabile locale viene vista prima di quella globale
    }

    /**
     * Costruttore con parametri
     * @param r Raggio del cerchio
     */
    public Cerchio(int r) {
        setRaggio(r);
    }


    // **************************************************
    // Metodi
    // **************************************************

    /**
     * Imposta il raggio del cerchio
     * @param r Raggio del cerchio
     */
    public void setRaggio(int r) {
        if (r < 0) {
            raggio = 0;
        } else {
            raggio = r;
        }
    }

    /**
     * Restituisce il raggio del cerchio
     * @return Raggio del cerchio
     */
    public int getRaggio() {
        return raggio;
    }

    /**
     * Inserisci raggio
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);
        int r;
        do {
            System.out.println("Inserisci il raggio: ");
            r = scan.nextInt();
        } while (r < 0);
        setRaggio(r);
    }

    /**
     * Calcola diametro del cerchio
     * @return Diametro del cerchio
     */
    public int calcoloDiametro() {
        int diametro = 2 * raggio;
        return diametro;
    }

    /**
     * Calcola circonferenza del cerchio
     * @return Circonferenza del cerchio
     */
    public double calcoloCirconferenza() {
        double circonferenza = 2 * Math.PI * raggio;
        return circonferenza;
    }

    /**
     * Calcola area del cerchio
     * @return Area del cerchio
     */
    public double calcolaArea() {
        double area = Math.PI * raggio * raggio;
        return area;
    }

    /**
     * Visualizza raggio del cerchio
     */
    public void visualizzaRaggio() {
        System.out.println("Il raggio e': " + getRaggio());
    }

    /**
     * Visualizza diametro del cerchio
     */
    public void visualizzaDiametro() {
        System.out.println("Il diametro e': " + calcoloDiametro());
    }

    /**
     * Visualizza circonferenza del cerchio
     */
    public void visualizzaCirconferenza() {
        System.out.println("La circonferenza e': " + calcoloCirconferenza());
    }

    /**
     * Visualizza area del cerchio
     */
    public void visualizzaArea() {
        System.out.println("L'area e': " + calcolaArea());
    }

    /**
     * Visualizza tutti i dati del cerchio
     */
    public void visualizza() {
        System.out.println("---= CERCHIO =---");
        visualizzaRaggio();
        visualizzaDiametro();
        visualizzaCirconferenza();
        visualizzaArea();
    }

}