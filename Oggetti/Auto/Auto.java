package auto;

import java.util.Scanner;

/**
 * Classe Auto
 * @author gbfactory
 * @date 06 02 2019
 */

public class Auto {

    String targa = "";
    String casaCostruttrice = "";
    int prezzo = 0;
    boolean venduta = false;

    /**
     * Costruttore di Default
     */
    Auto() {
        this.targa = "";
        this.casaCostruttrice = "";
        this.prezzo = 0;
        this.venduta = false;
    }

    /**
     * Controlla se la targa è una stringa di 7 caratteri
     * @param targa
     * @return boolean
     */
    private boolean checkTarga(String targa) {
        if (targa.length() == 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Controlla se il prezzo è un numero intero
     * @param prezzo
     * @return boolean
     */
    private boolean checkPrezzo(int prezzo) {
        if (prezzo > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Metodi SET
    /**
     * Imposta la targa
     * @param targa
     */
    public void setTarga(String targa) {
        if (checkTarga(targa)) {
            this.targa = targa;
        } else {
            this.targa = "";
        }
    }

    /**
     * Imposta la casa costruttrice
     * @param casaCostruttrice
     */
    public void setCasaCostruttrice(String casaCostruttrice) {
        this.casaCostruttrice = casaCostruttrice;
    }

    /**
     * Imposta il prezzo
     * @param prezzo
     */
    public void setPrezzo(int prezzo) {
        if (checkPrezzo(prezzo)) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }

    /**
     * Imposta venduta
     * @param venduta
     */
    public void setVenduta(boolean venduta) {
        this.venduta = venduta;
    }

    /**
     * Ottieni la targa
     * @return string
     */
    public String getTarga() {
        return this.targa;
    }

    /**
     * Ottieni la casa costruttrice
     * @return string
     */
    public String getCasaCostruttrice() {
        return this.casaCostruttrice;
    }

    /**
     * Ottieni il prezzo
     * @return string
     */
    public int getPrezzo() {
        return this.prezzo;
    }

    /**
     * Ottieni se l'auto è venduta o non venduta
     * @return string
     */
    public String getVenduta() {
        if (this.venduta) {
            return "VENDUTA";
        } else {
            return "NON VENDUTA";
        }
    }

    /**
     * toString
     * @return string
     */
    public String toString() {
        String s = "";
        s += getTarga();
        s += getCasaCostruttrice();
        s += getPrezzo();
        s += getVenduta();
        return s;
    }

    /**
     * Inserimento da input di tutti i dati di un'auto
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);

        // Inserisci targs
        String targa = "";
        do {
            System.out.println("Inserisci la targa");
            targa = scan.nextLine();
        } while (!checkTarga(targa));
        this.targa = targa;

        // Inserisci casa costruttrice
        String casaCostr = "";
        System.out.println("Inserisci la casa costruttrice");
        this.casaCostruttrice = casaCostr;

        // Inserisci prezzo
        int prezzo = 0;
        do {
            System.out.println("Inserisci il prezzo");
            prezzo = scan.nextInt();
        } while (!checkPrezzo(prezzo));
        this.prezzo = prezzo;

        // Inserisci venduta
        String strVenduta = "";
        do {
            System.out.println("Inserisci VENDUTA o NON VENDUTA");
            strVenduta = scan.nextLine();
        } while (!strVenduta.equalsIgnoreCase("VENDUTA") || !strVenduta.equalsIgnoreCase("NON VENDUTA"));
        if (strVenduta.equalsIgnoreCase("VENDUTA")) {
            this.venduta = true;
        } else if (strVenduta.equalsIgnoreCase("NON VENDUTA")) {
            this.venduta = false;
        }

    }

    /**
     * Stampa di tutte le informazioni di un'auto
     */
    public void visualizza() {
        System.out.println(getTarga());
        System.out.println(getCasaCostruttrice());
        System.out.println(getPrezzo());
        System.out.println(getVenduta());
    }

    /**
     * Confronta due auto e controlla se sono completamente uguali
     * @param auto
     * @return boolean
     */
    public boolean equals(Auto auto) {
        if (targa.equals(auto.targa) && casaCostruttrice.equals(auto.casaCostruttrice) && prezzo == auto.prezzo && venduta == auto.venduta) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Aumenta il prezzo di un'auto di un determinato valore intero maggiore di zero
     * @param prezzo
     */
    public void aumentaPrezzo(int prezzo) {
        if (checkPrezzo(prezzo)) {
            this.prezzo += prezzo;
        }
    }

    /**
     * Sconta il prezzo di un'auto di una percentuale intera
     * @param percentuale
     */
    public void sconto(int percentuale) {
        if (percentuale > 0) {
            int sconto = prezzo / 100 * percentuale;
            prezzo -= sconto;
        }
    }

    /**
     * Costruttore con parametri che utilizza i metodi SET per evitare di rifare le verifiche
     * @param targa
     * @param casaCostruttrice
     * @param prezzo
     * @param venduta
     */
    Auto(String targa, String casaCostruttrice, int prezzo, boolean venduta) {
        setTarga(targa);
        setCasaCostruttrice(casaCostruttrice);
        setPrezzo(prezzo);
        setVenduta(venduta);
    }
}
