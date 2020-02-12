package garage;

/**
 * Classe Furgone
 * Eredita dalla classe VeicoliAMotore
 *
 * @author gbfactory
 * @version 1.0
 * @since 12/02/2020
 */

public class Furgone extends VeicoliAMotore {

    // **************************************************
    // Dichiarazione variabili
    // **************************************************
    int capacitaCarico = 0;


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
     * Restituisce la capacità di carico di un furgone
     *
     * @return Capacità di carico di un furgone (numero intero)
     */
    public int getCapacitaCarico() {
        return capacitaCarico;
    }

    /**
     * Imposta la capacità di carico di un furgone
     *
     * @param capacitaCarico Capacità di carico (deve essere un numero intero maggiore di 0)
     */
    public void setCapacitaCarico(int capacitaCarico) {
        if (checkInt(capacitaCarico)) {
            this.capacitaCarico = capacitaCarico;
        } else {
            this.capacitaCarico = 0;
        }
    }

    // Metodo toString

    /**
     * Metodo toString
     * Restituisce tutti i dati del furgone
     *
     * @return Tutti i valori del furgone
     */
    @Override
    public String toString() {
        return "Furgone{" +
                "capacitaCarico=" + capacitaCarico +
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
     * Richiama il costruttore della classe VeicoliAMotore aggiungendo la capacitaCarico
     */
    Furgone() {
        super();
        capacitaCarico = 0;
    }

    /**
     * Costruttore con parametri
     * Utilizza i parametri pre-esistenti nella classe VeicoliAMotore aggiungendo la capacitaCarico
     *
     * @param annoImmatricolazione Anno di immatricolazione del veicolo (numero intero maggiore di 0)
     * @param marca Marca del veicolo (Stringa)
     * @param tipoAlimentazione Tipo di alimentazione del veicolo (Stringa)
     * @param cilindrata Cilindrata del veicolo (Numero intero)
     * @param capacitaCarico Capacita di carico del furgone (Numero intero) - Aggiunto rispetto alla classe VeicoliAMotore
     */
    Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int capacitaCarico) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.capacitaCarico = capacitaCarico;
    }

}
