package agenziaImmobiliare;

/**
 * Abstact Immobile
 *
 * @author gbfactory
 * @version 1.0
 * @since 16/02/2020
 */

public abstract class Immobile {

    public abstract String getCognome();

    public abstract String getNome();

    public abstract String getIndirizzo();

    public abstract double getPrezzo();

    public abstract void visualizza();

}
