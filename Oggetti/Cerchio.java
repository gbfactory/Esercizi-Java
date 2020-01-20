package oggetti;

/*
 * Descrizione: Classe rettangolo
 * Autore: Cognome nome
 * Data: 19 01 2020
 * Versione: 0.1
 *
 * Elenco:
 * 	- Costruttore di default -> Cerchio()
 +  - Costruttore con parametro -> Cerchio(r)
 *  - SET raggio
 *  - GET raggio
 *  - Inserisci raggio
 *  - Calcola diametro
 *  - Calcola circonferenza
 *  - Calcola area
 *  - Visualizza raggio
 *  - Visualizza diametro
 *  - Vidualizza circonferenza
 *  - Visualizza area
 *  - Visualizza tutto
 */

import java.util.Scanner;

public class Cerchio {

    // Attributi
    private int raggio;

    // Costruttori

    // Costruttore di default
    public Cerchio() {
        raggio = 0;
        // se dichiaro int raggio = 0 -> scope resolution, la variabile locale viene vista prima di quella globale
    }

    // Costruttore con raggio
    public Cerchio(int r) {
        setRaggio(r);
    }

    // Metodi

    // SET raggio
    public void setRaggio(int r) {
        if (r < 0) {
            raggio = 0;
        } else {
            raggio = r;
        }
    }

    // GET raggio
    public int getRaggio() {
        return raggio;
    }

    // Inserisci raggio
    public void inserisciRaggio() {
        Scanner scan = new Scanner(System.in);
        int r;
        do {
            System.out.println("Inserisci il raggio: ");
            r = scan.nextInt();
        } while (r < 0);
        setRaggio(r);
    }

    // Calcola diametro
    public int calcoloDiametro() {
        int diametro = 2 * raggio;
        return diametro;
    }

    // Calcola circonferenza
    public double calcoloCirconferenza() {
        double circonferenza = 2 * Math.PI * raggio;
        return circonferenza;
    }

    // Calcolo Area
    public double calcolaArea() {
        double area = Math.PI * raggio * raggio;
        return area;
    }

    // Visualizza raggio
    public void visualizzaRaggio() {
        System.out.println("Il raggio e': " + getRaggio());
    }

    // Visualizza diametro
    public void visualizzaDiametro() {
        System.out.println("Il diametro e': " + calcoloDiametro());
    }

    // Visualizza circonferenza
    public void visualizzaCirconferenza() {
        System.out.println("La circonferenza e': " + calcoloCirconferenza());
    }

    // Visualizza area
    public void visualizzaArea() {
        System.out.println("L'area e': " + calcolaArea());
    }

    // Visualizza tutto
    public void visualizza() {
        visualizzaRaggio();
        visualizzaDiametro();
        visualizzaCirconferenza();
        visualizzaArea();
    }

}
