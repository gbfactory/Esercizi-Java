public class OrdinamentoSelezione {

    static void ordina(int arr[]) {
        int len = arr.length;
        int min, ind_min, temp;
        for (int i = 0; i < len - 1; i++) {
            min = arr[i];
            ind_min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    ind_min = j;
                }
            }
            if (ind_min != i) {
                temp = arr[i];
                arr[i] = arr[ind_min];
                arr[ind_min] = temp;
            }
        }
    }

    static void stampa(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        final int DIM = 1000;
        int arr[] = new int [DIM];

        int min = 1;
        int max = DIM * 100;

        for(int i = 0; i < DIM; i++) {
            arr[i] = (int) ((min + Math.random() * max - min) + 1);
        }

        OrdinamentoSelezione.ordina(arr);
        System.out.println("Array ordinato");
        OrdinamentoSelezione.stampa(arr);

    }

}
