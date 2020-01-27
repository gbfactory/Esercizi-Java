package oggetti;

import java.util.Scanner;

public class MainQuadrato {

    public static void main(String[] args) {

        Quadrato q;	// Dichiarazione oggetto

        // Esempio 1
		/*q = new Quadrato();	// Richiamo il costruttore di default
		System.out.println(q); //Stampa indirizzo di memoria dove inizia il quadrato

		Quadrato q1 = new Quadrato(); // Equivalente al precedente
		System.out.println(q1);*/

        // Esempio 2
		/*q.visualizza();
		int areaMain = q.calcolaArea();
		System.out.println("L'area e': " + areaMain);*/

        // Esempio3
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il lato del quadrato");
        int lato = scan.nextInt();

        q = new Quadrato(lato);	// Richiamo il costruttore 2 passando il paramentro 2

        //q.lato = -7;	// Cambiare il valore del lato
        // Non accessibile (tipo private)

        q.visualizza();
        System.out.println("L'area del quadrato e': " + q.calcolaArea());

        scan.close();

    }

}
