package matrici;

// 16 12 2019

public class MatriciES02 {

    public static void main(String[] args) {

        // creazione vettore
        final int DIM = 80;
        int v[] = new int [DIM];

        // creazione matrice
        final int COLS = 8;
        final int ROWS = 10;
        int m[][] = new int [COLS][ROWS];

        int i, j, k;
        int min = 200;
        int max = 400;

        // riempimento vettore
        for (i = 0; i < DIM; i++) {
            v[i] = (int) (min + Math.random() * max - min + 1);
        }

        // stampa vettore
        for (i = 0; i < DIM; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
        System.out.println();

        // riempimento matrice
        k = 0;
        for (i = 0; i < COLS; i++) {
            for (j = 0; j < ROWS; j++) {
                m[i][j] = v[k];
                k++;
            }
        }

        // stampa matrice
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                System.out.print(m[j][i] + "\t");
            }
            System.out.println();
        }

        // n max
        int nMax = m[0][0];
        int nI = 0;
        int nJ = 0;

        for (i = 0; i < COLS; i++) {
            for (j = 0; j < COLS; j++) {
                if (m[i][j] > nMax) {
                    nMax = m[i][j];
                    nI = i;
                    nJ = j;
                }
            }
        }

        System.out.println("numero maggiore: " + nMax + " alla posizione " + nI + " " + nJ);

    }

}
