package ereditarieta;

/**
 * Classe QuadratoAColori (eredita dalla superclasse Quadrato)
 * @author gbfactory
 * @date 10 02 2020
 */

public class QuadratoAColori extends Quadrato {

    /*
     * String colore
     * tipo "private"   -> accessibile solo all'interno della classe
     * tipo "protected" -> rende la variabile pubblica alle classi che vanno ad ereditare (non molto usato)
     */
    private String colore = "";

    /*
     * SUPER.attributo (metodo della superclasse)
     * SUPER.metodo (metodo della superclasse)
     */

    /**
     * Costruttore di default (senza parametri) con colore predefinito bianco
     */
    public QuadratoAColori() {
        super();    // Richiamo il costruttore di default
        colore = "Bianco";      // Aggiungo il colore predefinito
    }

    /**
     * Costruttore con parametri
     * @param lato
     * @param colore
     */
    public QuadratoAColori(int lato, String colore) {
        super(lato);    // Richiamo il costruttore con parametri della superclasse Quadrato
        this.colore = colore;   // Aggiungo il colore
    }

    /**
     * Visualizzazione del quadrato a colori usando il metodo visualizza() della superclasse aggiungendo il colore
     * Overriding -> sovrascrivo il metodo visualizza() quando usato con il quadrato a colori
     */
    public void visualizza() {
        super.visualizza();     // Uso il metodo visualizza della superclasse
        System.out.println("Colore: " + this.colore);       // Aggiungo la visualizzazione del colore
    }

    /**
     * Metodo per impostare il colore da parametro
     * @param colore
     */
    public void setColore(String colore) {
        this.colore = colore;
    }

    /**
     * Metodo per ottenere il colore
     * @return String
     */
    public String getColore() {
        return colore;
    }

    /**
     * Metodo toString che utilizza il toString della superclasse aggiungendo il colore
     * @return String
     */
    public String toString() {
        return super.toString() + "\n" + getColore();
    }

    /**
     * Metodo per confrontare quadrato a colori
     * @param q
     * @return boolean
     */
    public boolean equals(QuadratoAColori q) {
        // Se confronto un QuadratoAColori con un Quadrato, verrà eseguito un downcasting del QuadratoAColori e solo il lato viene confrontato
        if ( (this.colore.equals(q.colore)) && (super.equals(q)) ) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * OVERLOADING  ->  (ex metodi) implementare metodi con lo stesso nome (signature o firma: nome del metodo). Avranno parametri di tipo diverso.
     * OVERRIDING   ->  (ex ereditarieta)
     *
     * Quadrato                 QuadratoAColori
     * __________________        __________________
     * |                |   <--- | Quadrato()     |
     * |                |        |                |
     * | visualizza()   |        | visualizza()   |
     * |                |        |                |
     * |________________|        |________________|
     *
     */

}
