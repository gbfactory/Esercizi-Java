package array;

// Dalla verifica del 15 11 2019
// 18 11 2019

public class ArrayVE03 {

    public static void main(String args[]) {

        // creazione vettore
        final int DIM = 90;
        int n[] = new int [DIM];

        // variabili
        int i;
        int count = 1;
        int tentativi = 0;
        int nGen = 1;
        int ran = 1;
        boolean num = false;

        // riempimento del vettore
        for (i = 0; i < DIM; i++) {
            // parte aggiungendo 1 a n[0]
            n[i] = count;
            // aumenta progressivamente il numero da inserire
            count++;
        }

        // ciclo fino a quando non vengono generati 90 numeri
        while (nGen < 90) {
            // reimposta la variabile booleana a false
            num = false;
            // resetta il numero dei tentativi
            tentativi = 0;
            // ciclo fino a quando la variabile booleana è falsa
            while (!num) {
                // genera un numero casuale
                ran = (int) (Math.random() * 90);
                // se il numero casuale è maggiore di 0
                if (n[ran] > 0) {
                    // importa la variabile booleana a true per uscire dal ciclo while
                    num = true;
                    // strampa il numero estratto
                    System.out.print(n[ran] + " ");
                    if (nGen % 10 == 0) {
                        System.out.println();
                    }
                    // sovrascrive con 0 il numero estratto dall'array, in modo che dopo quando si andrà a verificare se il numero estratto è maggiore di 0, questo numero già generto non verrà ripescato
                    n[ran] = 0;
                    // aumenta il contatore dei numeri generati
                    nGen++;
                }
                // autmenta il numero di tentativi
                tentativi++;
            }

            // stampa il numero di tentativi utilizzati per estrarre un nuovo numero casuale
            //System.out.println("Tentativi --> " + tentativi);

        }

    }

}