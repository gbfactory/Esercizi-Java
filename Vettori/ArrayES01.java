package array;

// 07 11 2019

public class ArrayES01 {

    public static void main(String[] args) {

        final int DIM = 5;
        int v[] = new int [DIM];

        int i, nMax, nMin;

        int nPos = 0;
        int nNeg = 0;
        int nNul = 0;

        // riempimento array
        for (i = 0; i < DIM; i++) {
            v[i] = (int) (1 + Math.random() * 100 - 1 + 1);
        }

        // stampa array
        for (i = 0; i < DIM; i++) {
            System.out.println(v[i]);
        }

        // array all'incontrario
        for (i = DIM - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }

        // stampa numeri pari
        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                System.out.println("NUMERO PARI --> " + v[i]);
            }
            if (i % 2 == 0) {
                System.out.println("NUMERO POSIZIONE PARI --> " + i);
            }
        }

        // n maggiore e minore
        nMax = v[0];
        nMin = v[0];

        for (i = 1; i < DIM; i++) {
            if (v[i] > nMax) {
                nMax = v[i];
            } else if (v[i] < nMin) {
                nMin = v[i];
            }
        }

        // n pos neg e nulli
        for (i = 1; i < DIM; i++) {
            if (v[i] > 0) {
                nPos++;
            } else if (v[i] < 0) {
                nNeg++;
            } else if (v[i] == 0) {
                nNul++;
            }
        }

        System.out.println("NUMERI POSITIVI --> " + nPos);
        System.out.println("NUMERI NEGATIVI --> " + nNeg);
        System.out.println("NUMERI    NULLI --> " + nNul);

    }

}
