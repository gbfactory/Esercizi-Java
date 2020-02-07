package auto;

import java.util.Scanner;

public class Auto {

    String targa = "";
    String casaCostruttrice = "";
    int prezzo = 0;
    boolean venduta = false;

    // Costruttore senza parametri

    Auto() {
        this.targa = "";
        this.casaCostruttrice = "";
        this.prezzo = 0;
        this.venduta = false;
    }

    // Metodi CHECK
    private boolean checkTarga(String targa) {
        if (targa.length() <= 7) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkPrezzo(int prezzo) {
        if (prezzo > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Metodi SET
    public void setTarga(String targa) {
        if (checkTarga(targa)) {
            this.targa = targa;
        } else {
            this.targa = "";
        }
    }

    public void setCasaCostruttrice(String casaCostruttrice) {
        this.casaCostruttrice = casaCostruttrice;
    }

    public void setPrezzo(int prezzo) {
        if (checkPrezzo(prezzo)) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }

    public void setVenduta(boolean venduta) {
        this.venduta = venduta;
    }

    // Metodi GET
    public String getTarga() {
        return this.targa;
    }

    public String getCasaCostruttrice() {
        return this.casaCostruttrice;
    }

    public int getPrezzo() {
        return this.prezzo;
    }

    public String getVenduta() {
        if (this.venduta) {
            return "VENDUTA";
        } else {
            return "NON VENDUTA";
        }
    }

    // Metodo toString
    public String toString() {
        String s = "";
        s += getTarga();
        s += getCasaCostruttrice();
        s += getPrezzo();
        s += getVenduta();
        return s;
    }

    // Metodo inserisci
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

    // Metodo visualizza
    public void visualizza() {
        System.out.println(getTarga());
        System.out.println(getCasaCostruttrice());
        System.out.println(getPrezzo());
        System.out.println(getVenduta());
    }

    // Metodo equals
    public boolean equals(Auto auto) {
        if (targa.equals(auto.targa) && casaCostruttrice.equals(auto.casaCostruttrice) && prezzo == auto.prezzo && venduta == auto.venduta) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo aumentaPrezzo
    public void aumentaPrezzo(int prezzo) {
        if (checkPrezzo(prezzo)) {
            this.prezzo += prezzo;
        }
    }

    //  Metodo sconto
    public void sconto(int percentuale) {
        if (percentuale > 0) {
            int sconto = prezzo / 100 * percentuale;
            prezzo -= sconto;
        }
    }

    // Costruttore con pareametri
    Auto(String targa, String casaCostruttrice, int prezzo, boolean venduta) {
        setTarga(targa);
        setCasaCostruttrice(casaCostruttrice);
        setPrezzo(prezzo);
        setVenduta(venduta);
    }
}
