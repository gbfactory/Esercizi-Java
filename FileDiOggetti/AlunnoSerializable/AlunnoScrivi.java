/**
 * Alunno Serializable Scrivi
 *
 * @author gbfactory
 * @since 30.03.2020
 */

package AlunnoSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AlunnoScrivi {

    public static void main(String[] args) {

        try {

            //FileOutputStream fos = new FileOutputStream("Alunno.dat");

            /**
             * Flusso output oggetti
             */
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Alunno.dat"));

            Alunno a;

            a = new Alunno("Giovanni", "Bianchi", 1996);
            oos.writeObject(a);
            System.out.println("Scritto su File " + a);

            a = new Alunno("Gianfranco", "Verdi", 2000);
            oos.writeObject(a);
            System.out.println("Scritto su File " + a);

            oos.flush();
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
