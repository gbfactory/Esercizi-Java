import java.util.*;

/**
 * Esercizio di ripasso sugli array
 *
 * @author gbfactory
 * @since 2020-10-05
 */

public class Array {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Inserimento delle dimensioni dell'array
        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = scan.nextInt();

        // Creazione array
        int v[] = new int [dim];

        // Riempimento array
        for (int i = 0; i < dim; i++) {
            v[i] = (int) (1 + Math.random() * 100 - 1 + 1);
        }

        Arrays.sort(v);

        System.out.println("ARRAY: " + Arrays.toString(v));

        // Numero minimo
        int numMin = min(v);
        System.out.println("MIN: " + numMin);

        // Numero massimo
        int numMax = max(v);
        System.out.println("MAX: " + numMax);

        // Somma
        int somma = somma(v);
        System.out.println("SOMMA: " + somma);

        // Media
        float media = media(v, somma);
        System.out.println("MEDIA: " + media);

        // Frequenza di ogni numero
        for (int i = 0; i < dim; i++) {
            int num = v[i];
            int temp = 0;

            for (int j = 0; j < dim; j++) {
                if (v[j] == num) {
                    temp++;
                }
            }

            if (temp > 1) System.out.println("Il numero " + num + " è stato trovato " + temp + " volte!");
        }

        // Numero vicino alla media
        int numVicino = numMax;
        int indiceVicino = 0;

        for (int i = 0; i < dim; i++) {
            int temp = (int)Math.abs(v[i] - media);
            if (temp < numVicino) {
                numVicino = temp;
                indiceVicino = i;
            }
        }

        System.out.println("NUMERO VICINO ALLA MEDIA: " + v[indiceVicino]);

        // Tutte le coppie di numeri consecutivi la cui somma è minore della media
        for (int i = 0; i < dim; i++) {
            if (i == dim - 1) break;

            int coppia = v[i] + v[i + 1];

            if (coppia < media) System.out.println("Coppia " + v[i] + " " + v[i + 1] + " ha somma " + coppia);
        }

        // Array di solo numeri pari e dispari
        ArrayList<Integer> numeriPari = new ArrayList<Integer>();
        ArrayList<Integer> numeriDispari = new ArrayList<Integer>();

        for (int num : v) {
            if (num % 2 == 0) numeriPari.add(num);
            else numeriDispari.add(num);
        }

        System.out.println("PARI: " + numeriPari);
        System.out.println("DISPARI: " + numeriDispari);

        // Varianza
        double sommatoria = 0;

        for (int num : v) {
            sommatoria += (num - media) * (num - media);
        }

        double varianza = sommatoria / v.length;

        System.out.println("VARIANZA: " + varianza);

        System.out.println("DEVIANZA: " + sommatoria);

        // Deviazione standard
        double devStandard = Math.sqrt(varianza);

        System.out.println("DEVIANZA: " + devStandard);

    }

    /**
     * Metodo per trovare il numero minore all'interno di un array
     * @param array Array in cui cercare il numero
     * @return Numero minore dell'array
     */
    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Metodo per trovare il numero maggiore all'interno di un array
     * @param array Array in cui cercare il numero
     * @return Numero maggiore dell'array
     */
    public static int max(int [] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Calcola la somma di tutti i numeri dell'array
     * @param array Array di cui effettuare la somma
     * @return Somma di tutti i numeri
     */
    public static int somma(int[] array) {
        int somma = 0;

        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }

        return somma;
    }

    /**
     * Media dell'array
     * @param array
     * @param numSomma
     * @return
     */
    public static float media(int[] array, int numSomma) {
        if (numSomma > 0) {
            return (float) numSomma / array.length;
        } else {
            return (float) somma(array) / array.length;
        }
    }
}
