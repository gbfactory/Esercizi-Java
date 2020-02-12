package garage;

/**
 * Classe Automobile
 * Eredita dalla classe VeicoliAMotore
 *
 * @author gbfactory
 * @version 1.0
 * @since 12/02/2020
 */

public class Automobile extends VeicoliAMotore {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************
    int numPorte = 0;


    // **************************************************
    // Metodi privati
    // **************************************************
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

    /**
     * Restituisce il numero delle porte
     *
     * @return Numero delle porte (numero intero)
     */
    public int getNumPorte() {
        return numPorte;
    }

    /**
     * Inserisce il numero delle porte
     *
     * @param numPorte Numero delle porte (deve essere un numero intero maggiore di 0)
     */
    public void setNumPorte(int numPorte) {
        if (checkInt(numPorte)) {
            this.numPorte = numPorte;
        } else {
            this.numPorte = 0;
        }
    }

    /**
     * Metodo toString
     *
     * @return Restituisce tutti i dati dell'Automobile
     */
    @Override
    public String toString() {
        return "Automobile{" +
                "numPorte=" + numPorte +
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
     * Richiama il costruttore della classe VeicoliAMotore aggiungendo il numPorte
     */
    Automobile() {
        super();
        numPorte = 0;
    }

    /**
     * Costruttore con parametri
     * Utilizza i parametri pre-esistenti nella classe VeicoliAMotore aggiungendo il numPorte
     *
     * @param annoImmatricolazione Anno di immatricolazione del veicolo (numero intero maggiore di 0)
     * @param marca Marca del veicolo (Stringa)
     * @param tipoAlimentazione Tipo di alimentazione del veicolo (Stringa)
     * @param cilindrata Cilindrata del veicolo (Numero intero)
     * @param numPorte Capacita di carico del furgone (Numero intero) - Aggiunto rispetto alla classe VeicoliAMotore
     */
    Automobile(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int numPorte) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.numPorte = numPorte;
    }
}
