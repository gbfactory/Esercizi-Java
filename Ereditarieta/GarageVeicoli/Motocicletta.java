package garage;

/**
 * Classe Motocicletta
 * Eredita dalla classe VeicoliAMotore
 *
 * @author gbfactory
 * @version 1.0
 * @since 12/02/2020
 */

public class Motocicletta extends VeicoliAMotore {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************
    String tipologia = "";
    int numTempiMotore = 0;


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
    // Metodi privati
    // **************************************************

    // Metodi GET

    /**
     * Restituisce la tipologia della motocicletta
     *
     * @return Tipologia della motocicletta
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Restituisce i numero tempi del motore della motocicletta
     *
     * @return Numero tempi motore della motocicletta
     */
    public int getNumTempiMotore() {
        return numTempiMotore;
    }

    // Metodi SET

    /**
     * Imposta la tipologia della motocicletta
     *
     * @param tipologia Tipologia della motocicletta (deve essere una stringa non nulla e non vuota)
     */
    public void setTipologia(String tipologia) {
        if (checkString(tipologia)) {
            this.tipologia = tipologia;
        } else {
            this.tipologia = "";
        }
    }

    /**
     * Imposta il numero tempi del motore
     *
     * @param numTempiMotore Numero tempi del motore (deve essere un numero intero maggiore di 0)
     */
    public void setNumTempiMotore(int numTempiMotore) {
        if (checkInt(numTempiMotore)) {
            this.numTempiMotore = numTempiMotore;
        } else {
            this.numTempiMotore = 0;
        }
    }

    // Metodo toString

    /**
     * Metodo toString
     *
     * @return Restituisce tutti i dati della Motocicletta
     */
    @Override
    public String toString() {
        return "Motocicletta{" +
                "tipologia='" + tipologia + '\'' +
                ", numTempiMotore=" + numTempiMotore +
                ", annoImmatricolazione=" + annoImmatricolazione +
                ", marca='" + marca + '\'' +
                ", tipoAlimentazione='" + tipoAlimentazione + '\'' +
                ", cilindata=" + cilindata +
                '}';
    }


    // **************************************************
    // Costruttori
    // **************************************************

    /**
     * Costruttore di default senza parametri
     * Richiama il costruttore della classe VeicoliAMotore aggiungendo la tipologia e il numTempiMotore
     */
    Motocicletta() {
        super();
        tipologia = "";
        numTempiMotore = 0;
    }

    /**
     * Costruttore con parametri
     * Utilizza i parametri pre-esistenti nella classe VeicoliAMotore aggiungendo la tipologia e il numTempiMotore
     *
     * @param annoImmatricolazione Anno di immatricolazione del veicolo (numero intero maggiore di 0)
     * @param marca Marca del veicolo (Stringa)
     * @param tipoAlimentazione Tipo di alimentazione del veicolo (Stringa)
     * @param cilindrata Cilindrata del veicolo (Numero intero)
     * @param tipologia Tipologia della Motocicletta (Stringa)
     * @param numTempiMotore Numero tempi del motore della Motocicletta (numero intero maggiore di 0)
     */
    Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, String tipologia, int numTempiMotore) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.tipologia = tipologia;
        this.numTempiMotore = numTempiMotore;
    }
}
