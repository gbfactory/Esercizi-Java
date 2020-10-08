import java.util.Arrays;
import java.util.Scanner;

public class ArrayMetodiF {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci dimensione array: ");
        int dim = scan.nextInt();

        scan.close();

        int lista[] = new int[dim];

        // Riempie la lista
        riempiLista(lista);
        // trova il numero piu' grande
        System.out.println("Il numero più grande all'interno dell'array è: " + numeroMassimo(lista));
        // trova il numero piu' piccolo
        System.out.println("Il numero più piccolo all'interno dell'array è: " + numeroMinimo(lista));
        // calcola la media
        System.out.println("La media è: " + media(lista));
        // trova il numero piu' vicino alla media
        System.out.println("Il numero piu' vicino alla media è: " + numeroVicino(lista));
        // coppie di numeri consecutivi
        coppieNumeri(lista);
        // array di numeri pari
        int listaPari[] = numeriPari(lista);
        Arrays.toString(listaPari);
        // array di numeri dispari
        int listaDispari[] = numeriDispari(lista);
        Arrays.toString(listaDispari);
        // varianza
        System.out.println("La varianza è: " + varianza(lista));
        // devianza
        System.out.println("La devianza è: " + devianza(lista));
        // deviazione
        System.out.println("La deviazione è: " + deviazioneStandard(lista));
    }

    // riempie l'array
    public static void riempiLista(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * 100) + 1);
        }
    }

    // crea un array con numeri pari
    public static int[] numeriPari(int array[]) {
        int contaPari = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contaPari++;
            }
        }

        int arrayPari[] = new int[contaPari];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPari[j] = array[i];
                j++;
            }
        }

        return arrayPari;
    }

    // crea un array con numeri dispari
    public static int[] numeriDispari(int array[]) {
        int contaDispari = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                contaDispari++;
            }
        }

        int arrayDispari[] = new int[contaDispari];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayDispari[j] = array[i];
                j++;
            }
        }

        return arrayDispari;
    }

    // trova il numero minimo
    public static int numeroMinimo(int array[]) {
        int numeroMinimo = 100;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < numeroMinimo) {
                numeroMinimo = array[i];
            }
        }

        return numeroMinimo;
    }

    // trova il numero massimo
    public static int numeroMassimo(int array[]) {
        int numeroMassimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > numeroMassimo) {
                numeroMassimo = array[i];
            }
        }

        return numeroMassimo;
    }

    // somma dei numeri nell'array
    public static double somma(int array[]) {
        double somma = 0;

        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }

        return somma;
    }

    // media dei numeri nell'array
    public static double media(int array[]) {
        double media = somma(array) / array.length;

        return media;
    }

    // calcola la frequenza di ogni numero
    public static void frequanzaNumero(int array[]) {
        int Con = 0;

        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length; i++) {
                if (array[j] == array[i]) {
                    Con++;
                }
            }

            if (Con > 1) {
                System.out.println("Il numero " + array[j] + " è uscito " + Con + " volte");
                System.out.println("");
            }

            Con = 0;
        }
    }

    // trova il numero più vicino alla media
    public static int numeroVicino(int array[]) {
        double differenza1;
        double differenza2 = 100;
        int nVicino = 0;

        for (int i = 0; i < array.length; i++) {
            differenza1 = Math.abs(array[i] - media(array));
            if (differenza1 < differenza2) {
                differenza2 = differenza1;
                nVicino = array[i];
            }
        }
        return nVicino;
    }

    // trova tutte le coppie di numeri consecutivi la cui somma è minore della media
    public static void coppieNumeri(int array[]) {
        for (int i = 0; i < (array.length - 1); i++) {
            int n1 = array[i];
            int n2 = array[i + 1];
            if ((n1 + n2) < media(array)) {
                System.out.println("Il numero " + n1 + " all'indice: " + i + " e il numero " + n2 + " all'indice " + (i + 1) + " sommati sono inferiori alla media.");

            }
        }
    }
    // sommatoria
    public static double sommatoria(int array[]) {
        double sommatoria = 0;
        double media = media(array);
        for (int i = 0; i < array.length; i++) {
            sommatoria += (array[i] - media) * (array[i] - media);
        }
        return sommatoria;
    }

    // varianza
    public static double varianza(int array[]) {

        double varianza = sommatoria(array) / array.length;

        return varianza;
    }

    // devianza
    public static double devianza(int array[]) {
        double devianza = sommatoria(array);
        return devianza;
    }

    // deviazione standard
    public static double deviazioneStandard(int array[]) {
        double deviazione = Math.sqrt(sommatoria(array));
        return deviazione;
    }

}
