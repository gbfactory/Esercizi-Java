package garage;

import java.util.Vector;

/**
 * Classe Garage
 *
 * @author gbfactory
 * @version 1.0
 * @since 12/02/2020
 */

public class Garage {

    VeicoliAMotore veicoli[] = new VeicoliAMotore[50];

    private int numVeicoli = 0;     // Numero veicoli effettivamente presenti nel garage

    /**
     * Visualizza posti disponibili
     *
     * @return Numero di posti disponibili
     */
    public int getPostiDisponibili() {
        int postiDisp = veicoli.length - numVeicoli;
        return postiDisp;
    }

    /**
     * Aggiungi nuovo veicolo al garage
     *
     * @param veicolo Tipo di veicolo (Furgone, Automobile, Motocicletta)
     */
    public void immettiNuovoVeicolo(String veicolo) {

        if (numVeicoli < veicoli.length) {  // Controllo che ci siano ancora posti

            if (veicolo.equalsIgnoreCase("Furgone")) {
                veicoli[numVeicoli] = new Furgone();
                veicoli[numVeicoli].inserisci();
            } else if (veicolo.equalsIgnoreCase("Automobile")) {
                veicoli[numVeicoli] = new Automobile();
                veicoli[numVeicoli].inserisci();
            } else if (veicolo.equalsIgnoreCase("Motocicletta")) {
                veicoli[numVeicoli] = new Motocicletta();
                veicoli[numVeicoli].inserisci();
            }

            numVeicoli++;

        } else {
            System.out.println("POSTI ESAURITI!");
        }

    }

    /**
     * Rimuovi veicolo dal garage
     *
     * @param posto Numero posto veicolo da rimuovere
     */
    public void estraiVeicolo(int posto) {

        if (posto <= numVeicoli) {

            posto--;    // Rimuovo 1 dal posto perché l'utente vede posto++, da 1 a 50 e non da 0 a 49!

            for (int i = posto; i < numVeicoli; i++) {
                veicoli[i] = veicoli[i + 1];
            }

            numVeicoli--;

            System.out.println("Veicolo rimosso!");

        } else {
            System.out.println("Posto non occupato!");
        }

    }

    /**
     * Visualizza tutti i veicoli nel garage
     */
    public void stampaSituazioneePosti() {

        /*for (VeicoliAMotore vm : veicoli) {
            vm.visualizza();
        }*/

        for (int i = 0; i < numVeicoli; i++) {
            System.out.println("POSTO N " + i + 1);
            veicoli[i].visualizza();
        }
    }



}
