package agenziaImmobiliare;

/**
 * Classe Appartamento
 *
 * @author gbfactory
 * @version 1.0
 * @since 15/02/2020
 */

import java.util.Scanner;

public class Appartamento extends Immobile {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************

    private String cognome = "";
    private String nome = "";
    private String indirizzo = "";
    private double superficie = 0.0;
    private boolean garage = false;
    private int numeroStanze = 0;
    private double prezzo = 0.0;


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
    private boolean checkNum(double num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }


    // **************************************************
    // Metodi pubblici
    // **************************************************

    // Metodi SET e GET

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if (checkString(cognome)) {
            this.cognome = cognome;
        } else {
            this.cognome = "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (checkString(nome)) {
            this.nome = nome;
        } else {
            this.nome = "";
        }
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        if (checkString(indirizzo)) {
            this.indirizzo = indirizzo;
        } else {
            this.indirizzo = "";
        }
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        if (checkNum(superficie)) {
            this.superficie = superficie;
        } else {
            this.superficie = 0;
        }
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        if (checkNum(numeroStanze)) {
            this.numeroStanze = numeroStanze;
        } else {
            this.numeroStanze = 0;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo() {
        prezzo = superficie * 1500 + numeroStanze * 1000;
    }

    // Metodo inserisci

    public void inserisci() {

        Scanner scan = new Scanner(System.in);

        String input = "";
        double inputDouble = 0;
        int inputInt = 0;

        // cognome
        do {
            System.out.println("Inserisci cognome proprietario");
            input = scan.nextLine();
        } while (!checkString(input));
        cognome = input;

        // nome
        do {
            System.out.println("Inserisci nome proprietario");
            input = scan.nextLine();
        } while (!checkString(input));
        nome = input;

        // indirizzo
        do {
            System.out.println("Inserisci l'indirizzo");
            input = scan.nextLine();
        } while (!checkString(input));
        indirizzo = input;

        // superficie
        do {
            System.out.println("Inserisci la superficie");
            inputDouble = scan.nextDouble();
        } while (!checkNum(inputDouble));
        superficie = inputDouble;

        scan.nextLine();

        // garage
        do {
            System.out.println("Inserisci se è presente il garage (Y/N)");
            input = scan.nextLine();
        } while (!checkString(input));
        if (input.equalsIgnoreCase("Y")) {
            garage = true;
        } else if (input.equalsIgnoreCase("N")) {
            garage = false;
        } else {
            System.out.println("ERR");
        }

        // numero stanze
        do {
            System.out.println("Inserisci il numero di stanze");
            inputInt = scan.nextInt();
        } while (!checkNum(inputInt));
        numeroStanze = inputInt;

        // prezzo
        setPrezzo();

    }

    // Metodo visualizza

    public void visualizza() {
        System.out.println("============================");
        System.out.println("Cognome: " + cognome);
        System.out.println("Nome: " + nome);
        System.out.println("Indirizzo: " + indirizzo);
        System.out.println("Superficie: " + superficie);
        System.out.println("Garage: " + garage);
        System.out.println("Numero Stanze: " +  numeroStanze);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("============================");
    }


    // **************************************************
    // Costruttori
    // **************************************************

    Appartamento() {
        cognome = "";
        nome = "";
        indirizzo = "";
        superficie = 0;
        garage = false;
        numeroStanze = 0;
        prezzo = 0;
    }

    Appartamento(String cognome, String nome, String indirizzo, double superficie, boolean garage, int numeroStanze, double prezzo) {
        setCognome(cognome);
        setNome(nome);
        setIndirizzo(indirizzo);
        setSuperficie(superficie);
        setGarage(garage);
        setNumeroStanze(numeroStanze);
        setPrezzo();
    }

}
