package oggetti;
import java.util.*;
public class Biblioteca {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		//punto 1-----------------------------------------------------
		int dim;
		do {
			System.out.println("inserisci il numero di libri: ");
			dim = tastiera.nextInt();
		}while(dim < 1 || dim > 100);

		Libro biblioteca[] = new Libro[dim];

		//punto 2------------------------------------------------------
		int i;
		for (i = 0; i < dim; i++) {
			System.out.println();
			System.out.println("inserisci il libro numero " + (i + 1));
			biblioteca[i] = new Libro();
			biblioteca[i].inserisci();

		}
		//punto 2.1
		for (i = 0; i < dim; i++) {
			System.out.println();
			System.out.println("libro " + (i + 1));
			biblioteca[i].visualizza();
		}

		//punto 3
		//inserito un isbn -> visualizzare il libro
		tastiera.nextLine();
		System.out.println("\ninserisci il codice isbn da cercare: ");
		String isbnIns = tastiera.nextLine();

//		for (i = 0; i < dim; i++) {
//			if (biblioteca[i].getIsbn().equalsIgnoreCase(isbnIns)) {
//				System.out.println("il libro con codice isbn che cercavi è " + (i + 1));
//				System.out.println(biblioteca[i]);
//				break;
//			}
//		}
//		if (i == dim)
//			System.out.println("non trovato!");

		boolean trovato = false;
		i = 0;
		while( (i < dim) && (trovato == false) ) {
			if (biblioteca[i].getIsbn().equalsIgnoreCase(isbnIns)) 
				trovato = true;
			else
				i++;
		}
		if (trovato == true) {
			System.out.println();
			System.out.println("il libro con codice isbn che cercavi è " + (i + 1));
			System.out.println(biblioteca[i]);
		}
		
		//punto 4
		System.out.println("\ninserisci il titolo da cercare: ");
		String titoloIns = tastiera.nextLine();
		
		trovato = false;
		i = 0;
		while( (i < dim) && (trovato == false) ) {
			if (biblioteca[i].getTitolo().equalsIgnoreCase(titoloIns)) 
				trovato = true;
			else
				i++;
		}
		if (trovato == true) {
			System.out.println();
			System.out.println("l'autore del libro è " + biblioteca[i].getAutore());
		}
		
		//punto 5
		int min, max;
		System.out.println("inserisci il minimo: ");
		min = tastiera.nextInt();
		System.out.println("inserisci il massimo: ");
		max = tastiera.nextInt();
		
		//se il minimo inserito è maggiore del massimo inserito li scambio
		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}
		
		for(i = 0; i < dim; i++) {
			if (biblioteca[i].getPrezzo() >= min && biblioteca[i].getPrezzo() <= max) {
				System.out.println(biblioteca[i]);
			}
		}
		
		//punto 6
		tastiera.nextLine();
		System.out.println("\ninserisci l'argomento da cercare: ");
		String argomentoIns = tastiera.nextLine();

		for (i = 0; i < dim; i++) {
			if (biblioteca[i].getArgomento().equalsIgnoreCase(argomentoIns)) {
				System.out.println("libro di " + argomentoIns);
				System.out.println(biblioteca[i]);
			}
		}
		
		//punto 7
		double prezzoMax = 0;
		for (i = 0; i < dim; i++) {
			if (biblioteca[i].getPrezzo() > prezzoMax) {
				prezzoMax = biblioteca[i].getPrezzo();
			}
		}
		System.out.println("\nelenco libri costosi");
		for (i = 0; i < dim; i++) {
			if (biblioteca[i].getPrezzo() == prezzoMax)
				System.out.println(biblioteca[i]);
		}
		
		
	}

}
