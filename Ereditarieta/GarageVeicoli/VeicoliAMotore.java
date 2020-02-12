package garage;

import java.util.Scanner;

/**
 * Classe base VeicoliAMotore
 *
 * @author gbfactory
 * @version 1.0
 * @since 12/02/2020
 */

public class VeicoliAMotore {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************

    int annoImmatricolazione = 0;
    String marca = "";
    String tipoAlimentazione = "";
    int cilindata = 0;


    // **************************************************
    // Metodi privati
    // **************************************************

    /**
     * Metodo per controllare che una stringa è valida
     *
     * @param str Stringa da controllare
     * @return Restitusce true se la stringa non è nulla e non è vuota, false in caso contrario
     */
    private boolean checkString(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo per controllare che un numero intero sia valido
     *
     * @param num Numero da controllarr
     * @return Restituisce true se il numero è maggiore di 0, false in caso contrario
     */
    private boolean checkInt(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }


    // **************************************************
    // Metodi pubblici
    // **************************************************

    // Metodi GET

    /**
     * Restiuisce l'anno di immatricolazione
     *
     * @return Restiusce un valore intero rappresentante l'anno di immatricolazione
     */
    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    /**
     * Restituisce la marca
     *
     * @return Restituisce una stringa rappresentante la marcas
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Restituisce il tipo di alimentazione
     *
     * @return Restuisce una stringa rappresentante il tipo di alimentazione
     */
    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    /**
     * Restituisce la cilindrata
     *
     * @return Restituisce un numero intero rappresentante la cilindrata
     */
    public int getCilindata() {
        return cilindata;
    }

    // Metodi SET

    /**
     * Imposta l'anno di immatricolazione
     *
     * @param annoImmatricolazione Anno di immatricolazione (deve essere un numero intero maggiore di 0)
     */
    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        if (checkInt(annoImmatricolazione)) {
            this.annoImmatricolazione = annoImmatricolazione;
        } else {
            this.annoImmatricolazione = 0;
        }
    }

    /**
     * Imposta la marca
     *
     * @param marca Marca (deve essere una stringa non nulla e non vuota)
     */
    public void setMarca(String marca) {
        if (checkString(marca)) {
            this.marca = marca;
        } else {
            this.marca = "";
        }
    }

    /**
     * Imposta il tipo di alimentazione
     *
     * @param tipoAlimentazione Tipo di alimentazione (deve essere una stringa non nulla e non vuota)
     */
    public void setTipoAlimentazione(String tipoAlimentazione) {
        if (checkString(tipoAlimentazione)) {
            this.tipoAlimentazione = tipoAlimentazione;
        } else {
            this.tipoAlimentazione = "0";
        }
    }

    /**
     * Imposta la cilindrata
     *
     * @param cilindata Valore della cilindrata (deve essere un numero intero maggiore di 0)
     */
    public void setCilindata(int cilindata) {
        if (checkInt(cilindata)) {
            this.cilindata = cilindata;
        } else {
            this.cilindata = 0;
        }
    }

    // Metodo inserisci

    /**
     * Metodo inserisci con controlli
     * Inserisci i dati di un veicolo con input da tastiera
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci l'anno di immatricolazione: ");
        int inputAnno = 0;
        do {
            inputAnno = scan.nextInt();
        } while (checkInt(inputAnno));
        annoImmatricolazione = inputAnno;

        System.out.println("Inserisci la marca: ");
        String inputMarca = "";
        do {
            inputMarca = scan.nextLine();
        } while (checkString(inputMarca));
        marca = inputMarca;

        System.out.println("Inserisci il tipo di alimentazione: ");
        String inputAli = "";
        do {
            inputAli = scan.nextLine();
        } while (checkString(inputAli));

        System.out.println("Inserisci  la cilindrata: ");
        int inputCili = 0;
        do {
            inputCili = scan.nextInt();
        } while (checkInt(inputCili));
        cilindata = inputCili;

    }

    // Metodo visualizza

    /**
     * Metodo visualizza
     * Visualizza tutti i dati del veicolo utilizzando i metodi GET
     */
    public void visualizza() {
        System.out.println("Anno di immatricolazione: " + getAnnoImmatricolazione());
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo di alimentazione: " + getTipoAlimentazione());
        System.out.println("Cilindrata: " + getCilindata());
    }

    // Metodo toString

    /**
     * Metodo toString
     * Restituisce tutti i dati del veicolo
     *
     * @return Tutti i valori del veicolo
     */
    @Override
    public String toString() {
        return "VeicoliAMotore{" +
                "annoImmatricolazione=" + annoImmatricolazione +
                ", marca='" + marca + '\'' +
                ", tipoAlimentazione='" + tipoAlimentazione + '\'' +
                ", cilindata=" + cilindata +
                '}';
    }


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore di default senza paremtri.
     * L'anno di immatricolazione e la cilindrata saranno 0, la marca e il tipo di alimentazione saranno stringhe vuote.
     */
    VeicoliAMotore() {
        annoImmatricolazione = 0;
        marca = "";
        tipoAlimentazione = "";
        cilindata = 0;
    }

    /**
     * Costruttore con parametri
     *
     * @param annoImmatricolazione L'anno di immatricolazione del veicolo. Deve essere un numero intero maggiore di 0.
     * @param marca La marca del veicolo. Deve essere una stringa non vuota e non nulla.
     * @param tipoAlimentazione Il tipo di alimentazione del veicolo. Deve essere una stringa non vuota e non nulla.
     * @param cilindata La cilindrata del veicolo. Deve essere un numero intero maggiore di 0.
     */
    VeicoliAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindata) {
        setAnnoImmatricolazione(annoImmatricolazione);
        setMarca(marca);
        setTipoAlimentazione(tipoAlimentazione);
        setCilindata(cilindata);
    }

}
