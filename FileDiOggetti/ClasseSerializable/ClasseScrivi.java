package ClasseSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClasseScrivi {

	public static void main(String[] args) {
		
		Classe classe = new Classe();

		Alunno a;

		a = new Alunno("Giovanni", "Bianchi", 1996);
		System.out.println("Scritto su file " + a);
		classe.aggiungiAlunno(a);

		a = new Alunno("Gianfranco", "Verdi", 2000);
		System.out.println("Scritto su file " + a);
		classe.aggiungiAlunno(a);

		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Classe.dat"));
			
			// Scrittura su file della classe con una sola istruzione
			oos.writeObject(classe);
			
			System.out.println("Scrittura " + classe);

			oos.flush();
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
