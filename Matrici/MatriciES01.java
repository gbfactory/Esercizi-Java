package matrici;

// 10 12 2019

import java.util.Scanner;

public class MatriciES01 {

    public static void main(String[] args) {

        final int ROWS = 10;
        final int COLS = 12;

        int m[][] = new int [ROWS][COLS];

        int i, j, k;

        int max = 100;
        int min = -100;
        int n;
        Scanner scan = new Scanner(System.in);

        // riempimento numeri casuali
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                m[i][j] = (int) ((Math.random() * ((max - min) + 1)) + min);
            }
        }

        // inserimento n di una colonna
        System.out.println("Inserisci un numero");
        n = scan.nextInt();

        // controllo n
        while (n < 0 || n > COLS - 1) {
            System.out.println("Inserisci nuovamente il numero");
            n = scan.nextInt();
        }

        // crezione vettore
        final int VCOL = 12;
        int vCol[] = new int [VCOL];

        k = 0;
        for (i = 0; i < ROWS; i++) {
            vCol[k] = m[i][n];
            k++;
        }

        // stampa vettore
        for (i = 0; i < VCOL; i++) {
            System.out.print(vCol[i] + "\t");
        }





    }

}
