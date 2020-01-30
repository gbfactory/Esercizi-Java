package oggetti;
import java.util.Scanner;
public class Studente {
	//attributi
	private String nome;
	private String cognome;
	private String classe;
	private int eta;

	//costruttori
	public Studente(){
		nome = "";
		cognome = "";
		classe = "";
		eta = 0;
	}

	//costruttore con parametri
	public Studente(String nome, String cognome, String classe, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {

		if(eta<0 && eta>120) {
			System.out.println("Età sbagliata");
			this.eta = 0;
		}
		else {
			this.eta = eta;
		}
	}

	public void inserisci() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il nome: ");
		nome = tastiera.nextLine();

		System.out.println("Inserisci il cognome: ");
		cognome = tastiera.nextLine();
		do {
			System.out.println("Inserisci la classe: ");
			classe = tastiera.nextLine();
			if (classe.charAt(0) < 48 ||classe.charAt(0) > 53) {
				System.out.println("Uagliò, si matt");
				System.out.println("reinserire: ");
			}
		}while(classe.charAt(0) < 48 ||classe.charAt(0) > 53 );
		do { 
			System.out.println("Inserisci l'età: ");
			eta = tastiera.nextInt();
			if (eta<0 || eta>120) {
				System.out.println("Uagliò, sbagliato");
			}
		}while (eta<0 || eta>120);
	}

	public String toString()
	{
		String s;
		s = "\n cognome =  " + cognome;
		s = s + "\n nome =  " + nome;
		s = s+ "\n classe =  " + classe;
		s = s+ "\n età =  " + eta;
		return s;
	}



}
