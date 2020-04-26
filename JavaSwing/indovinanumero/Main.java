package indovinanumero;

/**
 * Si deve far generare un numero casuale X compreso tra 1 e 100 senza visualizzarlo.
 * L’utente deve tentare di indovinarlo in un numero massimo di tentativi (per esempio 5). Il numero dei tentativi che rimangono deve essere sempre visualizzato.
 * Ad ogni tentativo se l'utente non lo indovina si visualizza un messaggio di aiuto che specifica se il numero inserito è maggiore o minore del numero X.
 *
 * Se lo indovina visualizzare "Hai vinto".
 * Aggiungere un  pulsante di reset per ripartire.
 *
 * @author gbfactory
 * @date 25/04/2020
 */


public class Main {
    public static void main(String[] args) {
        new IndovinaNumero();
    }
}
