package bibliotecaNuova;

/**
 * Classe Libro
 *
 * @author gbfactory, avv
 * @version 2.1
 * @since 30/01/2020
 */

import java.util.Scanner;

public class Libro {

    // **************************************************
    // Attributi
    // **************************************************

    private String isbn;
    private String titolo;
    private String autore;
    private String argomento;
    private double prezzo;


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

    /**
     * Controllo codice isbn (lunghezza e stringa)
     *
     * @param isbn Codice isbn
     * @return boolean (true valido, false non valido)
     */
    private boolean checkIsbn(String isbn) {
        if (isbn.length() < 13 && isbn.length() > 0 && checkString(isbn)) {
            return true;
        } else {
            return false;
        }
    }


    // **************************************************
    // Metodi pubblici
    // **************************************************

    // Metodi set/get

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (checkIsbn(isbn)) {
            this.isbn = isbn;
        } else {
            this.isbn = "";
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (checkString(autore)) {
            this.autore = autore;
        } else {
            this.autore = "";
        }
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        if (checkString(argomento)) {
            this.argomento = argomento;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (checkNum(prezzo)) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }

    // Metodo inserisci

    /**
     * Metodo inserisci per inserire da tastiera tutti i dati di un libro.
     */
    public void inserisci() {
        Scanner scan = new Scanner(System.in);

        String input = "";
        do {
            System.out.println("Inserisci ISBN: ");
            input = scan.nextLine();
        } while (!checkIsbn(input));
        this.isbn = input;

        input = "";
        do {
            System.out.println("Inserisci il titolo: ");
            input = scan.nextLine();
        } while (!checkString(input));
        this.titolo = input;

        input = "";
        do {
            System.out.println("Inserisci autore: ");
            input = scan.nextLine();
        } while (!checkString(input));
        this.autore = input;

        double num = 0;
        do {
            System.out.print("Inserisci prezzo: ");
            num = scan.nextDouble();
        } while (!checkNum(num));
        this.prezzo = num;

        //per scaricare il buffer di tastiera
        scan.nextLine();

        input = "";
        do {
            System.out.println("Inserisci argomento: ");
            input = scan.nextLine();
        } while (!checkString(input));
        this.argomento = input;

    }

    // Metodo visualizza

    /**
     * Metodo visualizza per visualizzare tutte i dati di un libro
     */
    public void visualizza() {
        System.out.println("=============================");
        System.out.println("ISBN: " + isbn);
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Argomento: " + argomento);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("=============================");
    }

    // Metodo tostring

    /**
     * Metodo toString
     * @return stringa di dati del libro
     */
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", argomento='" + argomento + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore di default senza parametri
     */
    public Libro() {
        titolo = "";
        autore = "";
        argomento = "";
        prezzo = 0;
        isbn = "";
    }

    /**
     * Costruttore con parametri e metodi get
     * @param isbn Codice isbn del libro
     * @param titolo Titolo del libro
     * @param autore Autore del libro
     * @param argomento Argomento del libro
     * @param prezzo Prezzo del libro
     */
    public Libro(String isbn, String titolo, String autore, String argomento, double prezzo) {
        setIsbn(isbn);
        setTitolo(titolo);
        setAutore(autore);
        setArgomento(argomento);
        setPrezzo(prezzo);
    }

}