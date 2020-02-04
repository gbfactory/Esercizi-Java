package prodotto;

import java.util.Scanner;

public class Prodotto {

    Scanner scan = new Scanner(System.in);

    String codice = "";
    String descrizione = "";
    int quantita = 0;
    int scorta = 0;

    // Metodi Check
    private boolean checkString(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkIntNum(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Costruttore di default senza parametri
    Prodotto() {
        this.codice = "";
        this.descrizione = "";
        this.quantita = 0;
        this.scorta = 0;
    }

    // Costruttore con parametri
    Prodotto(String codice, String descrizione, int quantita, int scorta) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.scorta = scorta;
    }

    // Costruttore di copia
    Prodotto(Prodotto p) {
        this.codice = p.codice;
        this.descrizione = p.descrizione;
        this.quantita = p.quantita;
        this.scorta = p.scorta;
    }

    // Metodi GET
    public String getCodice() {
        return this.codice;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public int getQuantita() {
        return this.quantita;
    }

    public int getScorta() {
        return this.scorta;
    }

    // Metodi SET
    public void setCodice(String codice) {
        if (checkString(codice)) {
            this.codice = codice;
        } else {
            this.codice = "";
        }
    }

    public void setDescrizione(String descrizione) {
        if (checkString(descrizione)) {
            this.descrizione = descrizione;
        } else {
            this.descrizione = "";
        }
    }

    public void setQuantita(int quantita) {
        if (checkIntNum(quantita)) {
            this.quantita = quantita;
        } else {
            this.quantita = 0;
        }
    }

    public void setScorta(int scorta) {
        if (checkIntNum(scorta)) {
            this.scorta = scorta;
        } else {
            this.scorta = 0;
        }
    }

    // Metodi inserisci
    public void inputCodice() {
        String input;
        do {
            System.out.println("Inserisci il codice: ");
            input = scan.nextLine();
        } while (!checkString(input));
        setCodice(input);
    }

    public void inputDescrizione() {
        String input;
        do {
            System.out.println("Inserisci la descrizione: ");
            input = scan.nextLine();
        } while (!checkString(input));
        setDescrizione(input);
    }

    public void inputQuantita() {
        int input;
        do {
            System.out.println("Inserisci la quantita: ");
            input = scan.nextInt();
        } while (!checkIntNum(input));
        setQuantita(input);
    }

    public void inputScorta() {
        int input;
        do {
            System.out.println("Inserisci la scorta: ");
            input = scan.nextInt();
        } while (!checkIntNum(input));
        setScorta(input);
    }

    public void inputAll() {
        inputCodice();
        inputDescrizione();
        inputQuantita();
        inputScorta();
    }

    // Metodi visualizzazione
    public void printCodice() {
        System.out.println(getCodice());
    }

    public void printDescrizione() {
        System.out.println(getDescrizione());
    }

    public void printQuantita() {
        System.out.println(getQuantita());
    }

    public void printScorta() {
        System.out.println(getScorta());
    }

    public void printAll() {
        printCodice();
        printDescrizione();
        printQuantita();
        printScorta();
    }

    // Metodo toString
    public String toString() {
        String s;
        s = "codice " + getCodice();
        s += "\ndescrizione " + getDescrizione();
        s += "\nquantita " + getDescrizione();
        s += "\nscorta " + getScorta();
        return s;
    }

    // Metodo aggiungi
    public void aggiungi(int quantita) {
        if (checkIntNum(quantita)) {
            this.quantita += quantita;
            System.out.println("Quantità portata a " + this.quantita);
        } else {
            System.out.println("ERR: Quantità non valida");
        }
    }

    // Metodo rimuovi
    public void rimuovi(int quantita) {
        if (checkIntNum(quantita)) {
            this.quantita -= quantita;
            System.out.println("Quantità portata a " + this.quantita);
        } else {
            System.out.println("ERR: Quantità non valida");
        }
    }

    public void inputRimuovi() {
        int q;
        do {
            System.out.println("Inserisci la quantità da rimuovere: ");
            q = scan.nextInt();
        } while (!checkIntNum(q));
        this.quantita = q;
    }

    // Metodo sottoscorta
    public boolean sottoScorta() {
        if (this.quantita < this.scorta) {
            return true;
        } else {
            return false;
        }
    }

}
