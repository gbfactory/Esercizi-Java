package array;

// Dalla verifica del 15 11 2019
// 18 11 2019

public class ArrayVE01 {

    public static void main(String args[]) {

        final int DIM = 200;
        int v[] = new int [DIM];

        int i;
        int somma = 0;
        double media = 0;
        int maggioriMedia = 0;
        int nPar = 0;
        int nDis = 0;
        int cPar = 0;
        int cDis = 0;

        for (i = 0; i < DIM; i++) {
            v[i] = (int) (Math.random() * 81) - 40;
        }

        for (i = 0; i < DIM; i++) {
            somma += v[i]; //somma = somma + v[i];
        }

        media = somma / 200.0;
        //media = (double) (somma) / DIM;

        System.out.println("La media è " + media);

        for (i = 0; i < DIM; i++) {
            if (v[i] > media) {
                maggioriMedia++;
            }
        }

        System.out.println("I numeri maggiori della media sono " + maggioriMedia);

        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                nPar++;
            } else if (v[i] % 2 != 0) {
                        nDis++;
            }
        }

        // vettore numeri pari
        final int PAR = nPar;
        int par[] = new int [PAR];

        // vettore numeri dispari
        final int DIS = nDis;
        int dis[] = new int [DIS];

        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                par[cPar] = v[i];
                cPar++;
            } else if (v[i] % 2 != 0) {
                dis[cDis] = v[i];
                cDis++;
            }
        }

    }

}