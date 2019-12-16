package array;

public class ArrayES08 {

    public static void main(String args[]) {

        final int DIM = 100;
        int v[] = new int [DIM];

        int i;
        int nPar = 0;
        int nDis = 0;
        int nPosPar = 0;
        int nNegDis = 0;

        int somma = 0;
        double media = 0;

        for (i = 0; i < DIM; i++) {
            v[i] = (int) (Math.random() * 201 - 100);
        }

        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                nPar++;
            } else if (v[i] % 2 == 0) {
                nDis++;
            } else if (v[i] % 2 == 0 && v[i] > 0) {
                nPosPar++;
            } else if (v[i] % 2 != 0 && v[i] < 0) {
                nNegDis++;
            }
        }

        // somma e media
        for (i = 0; i < DIM; i++) {
            somma = somma + v[i];
        }

        media = somma / 100.0;

        // numeri vicini alla media






    }

}