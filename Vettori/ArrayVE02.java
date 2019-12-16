package array;

// Dalla verifica del 15 11 2019
// 18 11 2019

public class ArrayVE02 {

    public static void main(String[] args) {

        final int DIM = 400;
        int v[] = new int [DIM];

        int i;
        boolean found = false;
        boolean numeri = false;
        int cDis = 0;
        int swap = 0;
        int input = 0;

        for (i = 0; i < DIM; i++) {
            v[i] = (int) (Math.random() * 401);
        }

        for (i = DIM - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }

        i = 0;
        while (i < DIM && !found) {
            if (v[i] == 27) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            System.out.println("Il numero 27 è stato trovato all'indice " + i);
        } else {
            System.out.println("Il numero 27 non è presente");
        }

        i = 0;
        while (i < DIM && !numeri) {
            //System.out.println(i);
            if (v[i] % 2 != 0) {
                System.out.println("Numero dispari --> " + v[i]);
                cDis++;
            }
            if (cDis == 4) {
                numeri = true;
            }
            i++;
        }

        System.out.println("VETTORE PRIMA");
        for (i = 0; i < DIM; i++) {
            System.out.println(v[i]);
        }

        while (swap < 10) {
            int randomA = (int) (Math.random() * 401);
            int randomB = (int) (Math.random() * 401);
            int temp = v[randomA];
            v[randomA] = v[randomB];
            v[randomB] = temp;
            swap++;
        }

        System.out.println("VETTORE DOPO");
        for (i = 0; i < DIM; i++) {
            System.out.println(v[i]);
        }



    }

}
