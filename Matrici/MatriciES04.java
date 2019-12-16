package matrici;

// 16 12 2019

public class MatriciES04 {

    public static void main(String[] args) {

        final int ROWS = 4;
        final int COLS = 4;
        int m[][] = new int [ROWS][COLS];

        int i, j;

        /*
         * 1 0 0 0
         * 0 1 0 0
         * 0 0 1 0
         * 0 0 0 1
         * */

        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }

        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLS; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
