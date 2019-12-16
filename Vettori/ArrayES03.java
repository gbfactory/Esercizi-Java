package array;

// 10 11 2019

public class ArrayES03 {

    public static void main(String args[]) {

        // vettore v
        final int DIM = 200;
        int v[] = new int [DIM];

        // vettore v0
        final int DIM0 = 200;
        int v0[] = new int[DIM0];

        int i;
        int j;

        int nPar = 0;

        int nPos = 0;
        int nNeg = 0;

        boolean found = false;

        int s50 = 0;
        double m50 = 0;

        // riempimento vettore
        for (i = 0; i < DIM; i++) {
            v[i] = (int) (Math.random() * 1001 - 500);
        }

        // visualizzazione del vettore creato
        for (i = 0; i < DIM; i++) {
            System.out.printf("v[%2d] = %3d - ", i, v[i]);
        }
        System.out.println();

        // numeri pari
        for (i = 0; i < DIM; i++) {
            if (v[i] % 2 == 0) {
                nPar++;
            }
        }
        System.out.println("Numeri pari --> " + nPar);

        // numero maggiore
        int nMax = v[0];

        for (i = 1; i <DIM; i++) {
            if (v[i] > nMax) {
                nMax = v[i];
            }
        }
        System.out.println("Numero maggiore --> " + nMax);

        // ricerca n 27
        /*i = 0;
        while (i < DIM && !found) {
            if (v[i] == 27) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            System.out.println("Il numero 27 e' presente all'indice " + i);
        } else {
            System.out.println("Il numero 27 non e' presente");
        }*/

        // ricerca nuovo metodo 21 11 2019
        for (i = 0; i < DIM; i++) {
            if (v[i] == 27) {
                break;
            }
        }

        if (v[i] == 27) {
            System.out.println("Il numero 27 e' presente all'indice "  + i);
        } else {
            System.out.println("Il numero 27 non e' presente");
        }

        // random
        // disabilitare se dim != 200
		for (i = 0; i <= 50; i++) {
			int rInd = (int) (Math.random() * 200);
			s50 = s50 + v[rInd];
		}

		m50 = s50 / 50.0;

		System.out.println("Somma di 50 n casuali --> " + s50);
		System.out.println("Media di 50 n casuali --> " + m50);

        // array al contrario
        // v 10 11 2019
		/*j = DIM;
		for (i = 0; i < DIM; i++) {
			v0[j - 1] = v[i];
			j--;
		}*/

        // v 11 11 2019
        j = DIM - 1;
        for (i = 0; i < DIM; i++) {
            v0[j] = v[i];
            j--;
        }

		/*for (i = 0; i < DIM; i++) {
			System.out.println(v[i]);
		}
		System.out.println("===============");
		for (i = 0; i < DIM; i++) {
			System.out.println(v0[i]);
		}*/

        // numeri positivi e negativi
        for (i = 0; i < DIM; i++) {
            if (v[i] > 0) {
                nPos++;
            } else if (v[i] < 0) {
                nNeg++;
            }

        }

        // array pos
        final int DIM1 = nPos;
        int v1[] = new int[DIM1];

        // array neg
        final int DIM2 = nNeg;
        int v2[] = new int[DIM2];

        int iPos = 0;
        int iNeg = 0;

        for (i = 0; i < DIM; i++) {
            if (v[i] > 0) {
                v1[iPos] = v[i];
                iPos++;
            } else if (v[i] < 0) {
                v2[iNeg] = v[i];
                iNeg++;
            }
        }

        /*for (i = 0; i < DIM1; i++) {
            System.out.println(v1[i]);
        }
        for (i = 0; i < DIM2; i++) {
            System.out.println(v2[i]);
        }*/

        //System.out.println("POSITIVI -> " + nPos + " " + v1.length);
        //System.out.println("NEGATIVI -> " + nNeg + " " + v2.length);

        // array somma
        int aLen = 0;

        if (v1.length > v2.length) {
            aLen = v1.length;
        } else if (v1.length < v2.length) {
            aLen = v2.length;
        } else {
            System.out.println("SPARATI");
        }

        final int DIM3 = aLen;
        int v3[] = new int[DIM3];

        int a, b;

        for (i = 0; i < DIM3; i++) {

            if (i < DIM1) {
                a = v1[i];
            } else {
                a = 0;
            }

            if (i < DIM2) {
                b = v2[i];
            } else {
                b = 0;
            }

            v3[i] = a + b;

        }

    }

}
