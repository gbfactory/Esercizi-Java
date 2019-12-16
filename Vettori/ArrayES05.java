package array;

public class ArrayES05 {

    // 14 11 2019

    public static void main(String args[]) {

        final int DIM = 500;
        int v[] = new int [DIM];

        int i;

        int somma = 0;
        int rSum = 0;
        double media = 0;

        int minMedia = 0;

        // riempimento vettore
        for (i = 0; i < DIM; i++) {
            v[i] = (int) (1 + Math.random() * 500 - 1 + 1);
        }

        // media
        for (i = 0; i < DIM; i++) {
            somma = somma + v[i];
        }

        media = somma / 500.0;

        // numeri min media
        for (i = 0; i < DIM; i++) {
            if (v[i] < media) {
                minMedia++;
            }
        }

        System.out.println("I numeri minori della media sono --> " + minMedia);

        // numeri pari dispari
        int nPar = 0;
        int nDis = 0;

        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                nPar++;
            } else {
                nDis++;
            }
        }

        final int PAR = nPar;
        int par[] = new int [PAR];

        final int DIS = nDis;
        int dis[] = new int [DIS];

        int iPar = 0;
        int iDis = 0;

        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                par[iPar] = v[i];
            } else {
                dis[iDis] = v[i];
            }
        }

        // somma casuale
        for (i = 0; i <= 50; i++) {
            int random = (int) (1 + Math.random() * 500 - 1 + 1);
            rSum+= v[random];
        }

    }

}
