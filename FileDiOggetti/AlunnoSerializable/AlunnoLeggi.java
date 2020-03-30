/**
 * Alunno Serializable Leggi
 *
 * @author gbfactory
 * @since 30.03.2020
 */

package AlunnoSerializable;

import java.io.*;

public class AlunnoLeggi {

    public static void main(String[] args) {

        try {

            /**
             * Flusso di input oggetti
             */
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Alunno.dat"));

            /**
             * Lettura di un file quando non si conosce il numero di oggetti contenuti
             * Legge fino a quando non si arriva alla fine del file (EOF - End Of File)
             * Quando c'è EOF gestici l'eccezione impostando read a false
             */
            boolean read = true;

            while (read) {

                try {

                    /**
                     * Quando leggi un oggetto è necessario fare il casting
                     * al tipo di oggetto che vogliamo leggere (dobbiamo conoscere il tipo)
                     */
                    Object obj = ois.readObject();

                    Alunno a = (Alunno) obj;

                    System.out.println("Letto " + a);

                } catch (EOFException e) {
                    read = false;
                } catch (ClassNotFoundException e) {
                    read = false;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
