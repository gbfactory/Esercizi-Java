package ClasseSerializable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClasseLeggi {

	public static void main(String[] args) {
		
		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Classe.dat"));

			// Lettura dal file
			Object obj = ois.readObject();

			// Casting
			Classe classe = (Classe) obj;

			System.out.println("Letto " + classe);

			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
