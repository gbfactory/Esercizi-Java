package array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ArrayES07 {

    public static void main(String args[]) throws ParseException {

        final int DIM = 365;
        int v[] = new int [DIM];

        int i = 0;

        // riempimento
        for (i = 0; i < DIM; i++) {
            v[i] = (int) (Math.random() * 61 - 30);
        }

        for (i = 0; i < DIM; i++) {
            System.out.println(v[i]);
        }

        // temp max min med
        int tMax = v[0];
        for (i = 1; i < DIM; i++) {
            if (v[i] > tMax) {
                tMax = v[i];
            }
        }

        int tMin = v[0];
        for (i = 1; i < DIM; i++) {
            if (v[i] < tMin) {
                tMin = v[i];
            }
        }

        int somma = 0;
        double tMid = 0;
        for (i = 0; i < DIM; i++) {
            somma = somma + v[i];
        }

        tMid = somma / 365.0;

        // temp tra 10 e 20
        for (i = 0; i < DIM; i++) {
            if (v[i] >= 10 && v[i] <= 20) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.DAY_OF_YEAR, v[i]);
                System.out.println("Giorno " + v[i] + " è " + calendar.getTime());

            }
        }

        // escursione
        int escursione = 0;
        for (i = 0; i < DIM; i++) {

            if ( Math.abs( (v[i]) - (v[i + 1]) ) == 5 ) {
                System.out.println("ESCURSIONE TERMICA!");
                escursione++;
            }

        }



    }

}
