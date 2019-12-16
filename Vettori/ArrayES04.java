package array;

// 11 11 2019

import java.util.HashMap;

public class ArrayES04 {

    public static void main(String args[]) {

        final int DIM = 6;
        int v[] = new int [DIM];

        int i;

        int nPar = 0;
        int nDis = 0;
        int nMax = 0;

        int somma = 0;
        double media = 0;

        boolean found = false;

        // riempimento array
        /*v[0] = 1;
        v[1] = 7;
        v[2] = 3;
        v[3] = 1;
        v[4] = 7;
        v[5] = 3;*/

        for (i = 0; i < DIM; i++) {
            v[i] = (int) (1 + Math.random() * 10 - 1 + 1);
        }

        // visualizzazione vettore
        for (i = 1; i <= DIM; i++) {
            System.out.printf("v[%3d] %4d - ", i - 1, v[i - 1]);

            if (i % 40 == 0) {
                System.out.println();
            }

        }

        System.out.println();

        // numeri pari dispari
        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                nPar++;
            } else if (v[i] % 2 != 0) {
                nDis++;
            }
        }

        if (nPar > nDis) {
            System.out.println("I numeri pari sono maggiori di quelli dispari.");
        } else {
            System.out.println("I numeri dispari sono maggiori di quelli pari.");
        }

        // numeri massimo

        nMax = v[0];

        for (i = 0; i < DIM; i++) {
            if (v[i] > v[0]) {
                nMax = v[i];
            }
        }

        System.out.println("Numero maggiore --> " + nMax);

        i = 0;
        while (i < DIM) {
            if (v[i] == nMax) {
                System.out.println("Indice --> " + i);
            }
            i++;
        }

        // somma e media
        for (i = 0; i < DIM; i++) {
            somma = somma + v[i];
        }
        media = somma / 6.0;

        System.out.println("SOMMA " + somma);
        System.out.println("MEDIA " + media);

        // numeri vicini media
        double diff = Math.abs(v[0] - media);
        double vicino = 0;

        for (i = 0; i < DIM; i++) {
            double iDiff = Math.abs(media - v[i]);
            if (iDiff < diff) {
                vicino = v[i];
                diff = iDiff;
            }
        }

        System.out.println(">>> " + vicino);

        // ricerca n 500
        i = 0;
        while (i < DIM && !found) {
            if (v[i] == 500) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            System.out.println("Il numero 500 è presente all'indice " + i);
        } else {
            System.out.println("Il numero 500 non è presente");
        }

        // visualizzazione pari dispari
        /*for (i = 0; i < DIM; i++) {
            if (i % 2 == 0) {
                System.out.println("NUMERO PARI --> " + v[i]);
            }
        }

        for (i = 0; i < DIM; i++) {
            if (i % 2 != 0) {
                System.out.println("NUMERO DISPARI --> " + v[i]);
            }
        }*/

        // frequenza num
        // https://www.w3schools.com/java/java_hashmap.asp
        HashMap<Integer, Integer> f = new HashMap<Integer, Integer>();

        for (i = 0; i < DIM; i++) {
            // se f contiene già il valore v dell'index i
            if (f.containsKey(v[i])) {
                // prende il valore precednete e ci aggiunge 1
                f.put(v[i], f.get(v[i]) + 1);
            } else {
                // se non è presente lo inserisce a 1
                f.put(v[i], 1);
            }
        }

        // stampa la lista
        System.out.println(f);

    }

}
