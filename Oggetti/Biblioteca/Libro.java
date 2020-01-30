package oggetti;
import java.util.*;

public class Libro {
	
	private String isbn;
	private String titolo;
	private String autore;
	private String argomento;
	private double prezzo;
	
	public Libro() {
		titolo = "";
		autore = "";
		argomento = "";
		prezzo = 0;
		isbn = "";
	}
	
	public Libro(String isbn, String titolo, String autore, String argomento, double prezzo) {
		this.isbn = isbn;
		this.titolo = titolo;
		this.autore = autore;
		this.argomento = argomento;
		if (prezzo < 0) 
			this.prezzo = 0;
		else 
			this.prezzo = prezzo;
	}

	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getArgomento() {
		return argomento;
	}

	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo < 0) 
			this.prezzo = 0;
		else 
			this.prezzo = prezzo;
	}
	
	public void inserisci() {
		Scanner tastiera = new Scanner(System.in);
		//do {
		System.out.print("Inserisci isbn: ");
		isbn = tastiera.nextLine();
		//}while();
		System.out.print("Inserisci titolo: ");
		titolo = tastiera.nextLine();
		System.out.print("Inserisci autore: ");
		autore = tastiera.nextLine();
		do {
			System.out.print("Inserisci prezzo: ");
			prezzo = tastiera.nextDouble();
		}while(prezzo < 0);
		//per scaricare il buffer di tastiera
		tastiera.nextLine();
		System.out.print("Inserisci argomento: ");
		argomento = tastiera.nextLine();
		
	}
	
	public void visualizza() {
		System.out.println("isbn: " + isbn);
		System.out.println("titolo: " + titolo);
		System.out.println("autore: " + autore);
		System.out.println("argomento: " + argomento);
		System.out.println("prezzo: " + prezzo);
	}
	
	public String toString() {
		String s;
		s = "isbn: " + isbn;
		s = s + "\ntitolo: " + titolo;
		s = s + "\nautore: " + autore;
		s = s + "\nargomento: " + argomento;
		s = s + "\nprezzo: " + prezzo;
		return s;
	}
}
