package garage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

        while (true) {

            System.out.println("========================");
            System.out.println("CHE OPERAZIONE VUOI ESEGUIRE?");
            System.out.println("1) Visualizza numero posti disponibili");
            System.out.println("2) Inserisci un nuovo veicolo");
            System.out.println("3) Elimina un veicolo");
            System.out.println("4) Visualizza lo stato del garage");
            System.out.println("========================");

            Scanner scan = new Scanner(System.in);

            int op = scan.nextInt();

            scan.nextLine();

            if (op == 1) {

                System.out.println(garage.getPostiDisponibili());

            } else if (op == 2) {

                System.out.println("========================");
                System.out.println("COSA VUOI INSERIRE?");
                System.out.println("    FURGONE");
                System.out.println("    AUTOMOBILE");
                System.out.println("    MOTOCICLETTA");
                System.out.println("========================");

                String veicolo = scan.nextLine();

                garage.immettiNuovoVeicolo(veicolo);

            } else if (op == 3) {

                System.out.println("INSERISCI IL POSTO DEL VEICOLO CHE VUOI ELIMINARE: ");
                int posto = 0;
                do {
                    posto = scan.nextInt();
                } while (posto < 0 || posto >= 50);

                garage.estraiVeicolo(posto);

            } else if (op == 4) {
                garage.stampaSituazioneePosti();
            }

        }

    }
}
