package auto;

import java.util.Scanner;

public class MainAuto {

    public static void main(String[] main) {

        // PRIMA PARTE

        Auto Auto1 = new Auto("123ABC3", "FIAT", 1000, false);

        Auto Auto2 = new Auto();

        Auto2.inserisci();

        Auto2.setVenduta(true);

        Auto1.aumentaPrezzo(1000);

        Auto2.sconto(10);


        // SECONDA PARTE

        // Dichiarazione vettore
        final int DIM = 40;
        Auto auto[] = new Auto[DIM];

        // Inserimento informazioni auto da input
        for (int i = 0; i < DIM; i++) {
            System.out.println("INSERISCI LE INFORMAZIONI DELLE AUTO ");
            auto[i].inserisci();
        }

        // Visualizzazione elenco auto
        for (int i = 0; i < DIM; i++) {
            auto[i].visualizza();
        }

        // Da input targa visualizzare caratteristiche
        Scanner scan = new Scanner(System.in);
        String targaInput = scan.nextLine();

        for (int i = 0; i < DIM; i++) {
            if (auto[i].targa.equalsIgnoreCase(targaInput)) {
                auto[i].visualizza();
            }
        }

        // Aumento prezzo fiat
        for (int i = 0; i < DIM; i++) {
            if (auto[i].getCasaCostruttrice().equalsIgnoreCase("FIAT")) {
                auto[i].aumentaPrezzo(500);
            }
        }

        // Auto con il prezzo maggiore
        int maxPrice = auto[0].getPrezzo();

        for (int i = 0; i < DIM; i++) {
            if (auto[i].getPrezzo() > maxPrice) {
                maxPrice = auto[i].getPrezzo();
            }
        }

        for (int i = 0; i < DIM; i++) {
            if (auto[i].getPrezzo() == maxPrice) {
                auto[i].visualizza();
            }
        }

        // Auto di lusso
        int cLusso = 0;

        for (int i = 0; i < DIM; i++) {
            if (auto[i].getPrezzo() > 50000) {
                cLusso++;
            }
        }

        Auto autoDiLusso[] = new Auto[cLusso];

        int vLusso = 0;

        for (int i = 0; i < DIM; i++) {
            if (auto[i].getPrezzo() > 50000) {
                autoDiLusso[vLusso] = auto[i];
            }
        }

    }

}
