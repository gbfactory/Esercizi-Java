package matrici;

// 16 12 2019

import java.util.Scanner;

public class MatriciES03 {

    public static void main(String[] args) {

        final int ROWS = 5;
        final int COLS = 4;

        int m[][] = new int [ROWS][COLS];

        int i, j, r;
        int min = 1;
        int max = 100;
        int nMult6 = 0;
        int rSum = 0;

        Scanner scan = new Scanner(System.in);

        // riempimento matrice
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                m[i][j] = (int) (min + Math.random() * max - min + 1);
            }
        }

        // stampa matrice
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        // numeri multipli di 6
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                if (m[i][j] % 6 == 0) {
                    nMult6++;
                }
            }
        }

        System.out.println("I numeri multipli di 6 sono " + nMult6);

        // numero r
        System.out.println("Inserisci numero riga");
        r = scan.nextInt();

        // somma elementi riga R
        for (i = 0; i < COLS; i++) {
            rSum += m[r][i];
        }

        System.out.println(rSum);

    }

}
