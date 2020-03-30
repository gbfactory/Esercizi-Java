package ClasseSerializable;

import java.util.Vector;
import java.io.Serializable;

public class Classe implements Serializable {

	private static final long serialVersionUID = 1L;

	private Vector<Alunno> alunni;

	/**
	 * Costruttore
	 */
	public Classe() {
		alunni = new Vector<Alunno>(10, 3);
	}

	/**
	 * Ottieni il numero di alunni nel vettore
	 * @return Numero di alunni presenti nel vettore
	 */
	public int numeroAlunni() {
		return alunni.size();
	}

	/**
	 * Aggiungi un alunno al vettore
	 * @param a Alunno da aggiungere
	 */
	public void aggiungiAlunno(Alunno a) {
		alunni.add(a);
	}

	/**
	 * Aggiungi un alunno al vettore nella posizione desiderata
	 * @param pos Alunno da aggiungere
	 * @param a Posizione in cui aggiungere l'alunno
	 */
	public void aggiungiAlunno(int pos, Alunno a) {
		alunni.add(pos, a);
	}

	/**
	 * Rimuovi un alunno dal vettore
	 * @param pos Posizione dell'alunno da rimuovere
	 * @return Alunno rimosso
	 */
	public Alunno rimuoviAlunno(int pos) {
		Alunno a = alunni.remove(pos);
		return a;
	}

	/**
	 * Metodo toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "Classe{" +
				"alunni=" + alunni +
				'}';
	}

}
