package vestiti;

import java.util.Arrays;
import java.util.Scanner;

public class Vestito {

    Scanner scan = new Scanner(System.in);

    String marca = "";
    String modello = "";
    String taglia = "";
    int quantita = 0;
    double prezzo = 0;

    // Costruttori di default
    Vestito() {
        this.marca = "";
        this.modello = "";
        this.taglia = "";
        this.quantita = 0;
        this.prezzo = 0;
    }

    // Metodi check
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

    private boolean checkTaglia(String tg) {
        String[] taglie = {"XS", "XS/S", "S", "M", "L", "L/XL", "XL/1X", "1X/2X", "2X"};

        // https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java
        boolean checkTaglia = Arrays.stream(taglie).anyMatch(tg::equals);

        if (checkTaglia) {
            return true;
        } else {
            return false;
        }

    }

    // Metodi SET
    public void setMarca(String marca) {
        if (checkString(marca)) {
            this.marca = marca;
        } else {
            this.marca = "";
        }
    }

    public void setModello(String modello) {
        if (checkString(modello)) {
            this.modello = modello;
        } else {
            this.modello = "";
        }
    }

    public void setTaglia(String taglia) {

        String taglia2 = taglia.toUpperCase();

        if (checkString(taglia2) && checkTaglia(taglia2)) {
            this.taglia = taglia2;
        } else {
            this.taglia = "";
        }
    }

    public void setQuantita(int quantita) {
        if (checkIntNum(quantita)) {
            this.quantita = quantita;
        } else {
            this.quantita = 1;
        }
    }

    public void setPrezzo(double prezzo) {
        //this.prezzo = (prezzo > 0) ? prezzo : 0;
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }

    // Metodi GET
    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    public String getTaglia() {
        return this.taglia;
    }

    public int getQuantita() {
        return this.quantita;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    // Metodi inserisci
    public void inputMarca() {
        String in = "";
        do {
            System.out.println("Inserisci la marca: ");
            in = scan.nextLine();
        } while (!checkString(in));
    }

    public void inputModello() {
        String in = "";
        do {
            System.out.println("Inserisci il modello: ");
            in = scan.nextLine();
        } while (!checkString(in));
        this.modello = in;
    }

    public void inputTaglia() {
        String in = "";
        do {
            System.out.println("Inserisci la taglia: ");
            in = scan.nextLine();
        } while (!checkString(in) && !checkTaglia(in));
        this.taglia = in;
    }

    public void inputQuantita() {
        int q = 0;
        do {
            System.out.println("Inserisci la quantità: ");
            q = scan.nextInt();
        } while (!checkIntNum(q));
        this.quantita = q;
    }

    public void inputPrezzo() {
        double p = 0;
        do {
            System.out.println("Inserisci il prezzo: ");
            p = scan.nextDouble();
        } while (p < 0);
        this.prezzo = p;
    }

    public void inputAll() {
        inputMarca();
        inputModello();
        inputTaglia();
        inputQuantita();
        inputPrezzo();
    }

    // Metodo toString
    public String toString() {
        String s;
        s = "marca: " + marca;
        s = s + "\nmodello: " + modello;
        s = s + "\ntaglia: " + taglia;
        s = s + "\nquantita: " + quantita;
        s = s + "\nprezzo: " + prezzo;
        return s;
    }

    // Metodi visualizza
    public void printMarca() {
        System.out.println(getMarca());
    }

    public void printModello() {
        System.out.println(getModello());
    }

    public void printTaglia() {
        System.out.println(getTaglia());
    }

    public void printQuantita() {
        System.out.println(getQuantita());
    }

    public void printPrezzo()  {
        System.out.println(getPrezzo());
    }

    // Metodo sconto
    public void sconto(double percentuale) {
        this.prezzo = prezzo - prezzo * percentuale / 100;
    }

    // Metodo vende quantita
    public void vende(int quantita) {
        if (quantita > 0 && quantita <= this.quantita) {
            this.quantita -= quantita;
        } else {
            System.out.println("ERRORE: quantità sbagliata");
        }
    }

    // Metodo sottoscorta
    public boolean sottoScorta(int scorta) {
        if (this.quantita < scorta) {
            return true;
        } else {
            return false;
        }
    }

    // Costruttore con parametri
    Vestito(String marca, String modello, String taglia, int quantita, double prezzo) {
        setMarca(marca);
        setModello(modello);
        setTaglia(taglia);
        setQuantita(quantita);
        setPrezzo(prezzo);
    }

}
