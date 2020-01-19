package oggetti;

/*
 * Descrizione: Classe rettangolo
 * Autore: Cognome nome
 * Data: 16 01 2020
 * Versione: 0.2
 *
 * Elenco:
 * 	- Costruttore di default -> Rettangolo()
 * 	- Costruttore con 2 parametri -> Rettangolo(base, altezza)
 * 	- SET/GET setBase(b), setAltezza(a), getBase(), getAltezza()
 * 	- Metodo visualizza()
 * 	- Metodo calcoloArea()
 * 	- Metodo calcoloPerimetro()
 */

import java.util.Scanner;

public class Rettangolo {
	
	//Attributi
	private int base;
	private int altezza;
	
	//Costruttori	-> NB: non ci devono essere visualizzazioni
	//				-> NB: non ha input o interazioni con utente
	
	//Costruttore di default
	public Rettangolo() {
		base=0;
		altezza=0;
	}
	
	//Parametri: b=base a=altezza
	public Rettangolo(int b, int a) {
		base=b;  
		altezza=a;
	}
	
	//Metodi
	
	// Metodi SET
	public void setBase(int b) {
		base = b;
	}
	
	public void setAltezza(int a) {
		altezza = a;
	}
	
	// Metodi GET	->	NB non ci devono essere visualizzazioni!
	public int getBase() {
		return base;	// Restituisce la base del rettangolo
	}
	
	public int getAltezza() {
		return altezza;	// Restituisce l'altezza del rettangolo
	}
	
	// Inserisci base
	public void inserisci() {
		Scanner scan = new Scanner(System.in);
		
		int b;
		do {
			System.out.println("Inserisci la base: ");
			b = scan.nextInt();
		} while (b < 0);
		setBase(b);
		
		int a;
		do {
			System.out.println("Inserisci l'altezza: ");
			a = scan.nextInt();
		} while (a < 0);
		setBase(a);
	}
	
	// Visualizza base
	public void visualizzaBase() {
		System.out.println("La base e' : " + base);
	}
	
	// Visualizza altezza
	public void visualizzaAltezza() {
		System.out.println("L'altezza e' : " + altezza);
	}
	
	// Metodo visualizza	
	public void visualizza() {
		visualizzaBase();
		visualizzaAltezza();
		visualizzaArea();
		visualizzaPerimetro();
	}
	
	// Metodo calcolo area
	public int calcoloArea() {
		int area=base*altezza;	//area -> variabile locale (vive solo li' dentro)
		return area;
	}
	
	// Metodo visualizza area
	public void visualizzaArea() {
		System.out.println("L'area e': " + calcoloArea());
	}
	
	// Metodo calcolo perimetro
	public int calcoloPerimetro() {
		int perimetro=2*(base+altezza);
		return perimetro;
	}
	
	// Metodo visualizza perimetro
	public void visualizzaPerimetro() {
		System.out.println("Il perimetro e' : " + calcoloPerimetro());
	}
	
}
