package agenziaImmobiliare;

/**
 * Classe negozio
 *
 * @author gbfactory
 * @version 1.0
 * @since 19/02/2020
 */

import java.util.Scanner;

public class Negozio extends Immobile {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************
    private String cognome = "";
    private String nome = "";
    private String indirizzo = "";
    private double superficieNegozio = 0;
    private double superficieMagazzino = 0;
    private int numeroVetrine = 0;
    private double prezzo = 0;


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

    public double getSuperficieNegozio() {
        return superficieNegozio;
    }

    public void setSuperficieNegozio(double superficieNegozio) {
        if (checkNum(superficieNegozio)) {
            this.superficieNegozio = superficieNegozio;
        } else {
            this.superficieNegozio = 0;
        }
    }

    public double getSuperficieMagazzino() {
        return superficieMagazzino;
    }

    public void setSuperficieMagazzino(double superficieMagazzino) {
        if (checkNum(superficieMagazzino)) {
            this.superficieMagazzino = superficieMagazzino;
        } else {
            this.superficieMagazzino = 0;
        }
    }

    public int getNumeroVetrine() {
        return numeroVetrine;
    }

    public void setNumeroVetrine(int numeroVetrine) {
        if (checkNum(numeroVetrine)) {
            this.numeroVetrine = numeroVetrine;
        } else {
            this.numeroVetrine = 0;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo() {
        prezzo = superficieNegozio * 1300 + superficieMagazzino * 500 + numeroVetrine * 1500;
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

        // superficie negozio
        do {
            System.out.println("Inserisci la superficie del negozio");
            inputDouble = scan.nextDouble();
        } while (!checkNum(inputDouble));
        superficieNegozio = inputDouble;

        // superficie magazzino
        do {
            System.out.println("Inserisci la superficie del magazzino");
            inputDouble = scan.nextDouble();
        } while (!checkNum(inputDouble));
        superficieMagazzino = inputDouble;

        scan.nextLine();

        // n vetrine
        do {
            System.out.println("Inserisci il numero di vetrine");
            inputInt = scan.nextInt();
        } while (!checkNum(inputInt));
        numeroVetrine = inputInt;

        // prezzo
        setPrezzo();

    }

    // Metodo visualizza

    public void visualizza() {
        System.out.println("============================");
        System.out.println("Cognome: " + cognome);
        System.out.println("Nome: " + nome);
        System.out.println("Indirizzo: " + indirizzo);
        System.out.println("Superficie negozio: " + superficieNegozio);
        System.out.println("Superficie magazzino: " + superficieMagazzino);
        System.out.println("Numero vetrine: " + numeroVetrine);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("============================");
    }


    // **************************************************
    // Costruttore
    // **************************************************

    Negozio() {
        cognome = "";
        nome = "";
        indirizzo = "";
        superficieNegozio = 0;
        superficieMagazzino = 0;
        numeroVetrine = 0;
        prezzo = 0;
    }

    Negozio(String cognome, String nome, String indirizzo, double superficieNegozio, double superficieMagazzino, int numeroVetrine, double prezzo) {
        setCognome(cognome);
        setNome(nome);
        setIndirizzo(indirizzo);
        setSuperficieNegozio(superficieNegozio);
        setSuperficieMagazzino(superficieMagazzino);
        setNumeroVetrine(numeroVetrine);
        setPrezzo();
    }

}
