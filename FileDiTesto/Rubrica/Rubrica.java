package RubricaWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * Rubrica
 * @author frann 
 *
 */

public class Rubrica {

	public static void main(String[] args) {
		int Dim=4;
		Scanner scan = new Scanner(System.in);
		ArrayList<Persona> v = new ArrayList <Persona>();
		
		try {

			String nomeFile = "Prova.txt";
			String linea;
			FileInputStream fin;

			fin = new FileInputStream(nomeFile);


			Scanner in = new Scanner(fin);

			// finchè ci sono prodotti da leggere 
			while(in.hasNextLine()) {
				// legge un prodotto
				linea = in.nextLine();

				// divide gli elementi con metodo split(...)
				String elementi[] = linea.split(";");

				String Nome = elementi[0];
				String Cognome = elementi[1];
				String Numero = elementi[2];
				String Mail = elementi[3];
				
				Persona p = new Persona(Nome,Cognome,Numero,Mail);
				v.add(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		int i=0;	



		//punto 2------------------------------------------------------------
		while (true) {
			System.out.println("1- Nuovo contatto:");
			System.out.println("2- Visualizza la rubrica:");
			System.out.println("3- Aggiorna il numero di telefono:");
			System.out.println("4- Elimina un contatto:");
			System.out.println("5- Cerca contatto:");
			System.out.println("6- Esci:");

			int numeroscelta = scan.nextInt();

			if (numeroscelta == 1) {
				System.out.println();
				System.out.println("Inserisci il contatto numero " + (i + 1));
				i++;
				Persona p = new Persona();
				p.Inserisci();
				v.add(p);
				
			} else if (numeroscelta == 2) {

				System.out.println();
				System.out.println("Visualizzazione dei contatti: ");
				System.out.println();
				for (Persona p : v) {
					p.Visualizza();	
					System.out.println("--------------------------------------------------");
				}

			} else if (numeroscelta ==3) {

				System.out.println();
				System.out.println("Aggiorna il numero di telefono: ");
				System.out.println("Inserisci il nome della persona a cui vuoi aggiornare il numero: ");
				scan.nextLine();
				String numeroins= scan.nextLine();


			} else if (numeroscelta ==4) {
				System.out.println();
				System.out.println("Cancella un contatto: ");
				System.out.println("Inserisci il nome del contatto che vuoi cancellare: ");
				scan.nextLine();
				String nomeins = scan.nextLine();
				for (Persona p : v) {
					if(p.getNome().equalsIgnoreCase(nomeins)) {
						v.remove(p); 		
						System.out.println("Il contatto e' stato rimosso correttamente");
						break;
					}

				}

			} else if (numeroscelta == 5) {
				System.out.println();
				System.out.println("Insersci il nome che vuoi cercare: ");
				String nomeins = scan.nextLine();
				System.out.println("Insersci il cognome: ");
				String cognomeins = scan.nextLine();
				for (Persona p : v) {
					if((p.getNome().equalsIgnoreCase(nomeins)) && (p.getCognome().equalsIgnoreCase(cognomeins))) {
						System.out.println("Il numero di telefono che cercavi e' "+p.getNumero());
						break;
					}
				}
			} else if (numeroscelta == 6) {
				System.out.println("Sei uscito dal programma");
				break;
			}
			String nomeFile = "Prova.txt";
	        try {

	            // fw gestisce il file su disco
	            FileWriter fw = new FileWriter(nomeFile);

	            // pw permette di scrivere stringhe ed altro con print...
	            PrintWriter pw = new PrintWriter(fw);

	            for (Persona p : v) {
	            	pw.println(p.getNome()+";"+p.getCognome()+";"+p.getNumero()+";"+p.getMail()); 
	            }
	            
	            pw.close();
	            
	        } catch (IOException e) {
	            System.out.println("Eccezione " + e);
	            e.printStackTrace();
	        }
		}
	}
}
