package RubricaWriter;

import java.util.Scanner;
public class Persona {

	private String Nome;
	private String Cognome;
	private String Numero;
	private String Mail;
	
	public Persona() {
		Nome = " ";
		Cognome=" ";
		Numero=" ";
		Mail="";
	}
	public Persona(String Nome, String Cognome, String Numero, String Mail) {
		this.Nome=Nome;
		this.Cognome=Cognome;
		this.Numero=Numero;
		this.Mail=Mail;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) {
		Numero = numero;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	public void Inserisci() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il nome della persona:");
		Nome=scan.nextLine();
		
		System.out.println("Inserisci il cognome della persona:");
		Cognome=scan.nextLine();
		
		int i=0;
		int lun=0;
		do {
			if(i>0) {
				System.out.println("Re-inserisci il numero della persona:");
				System.out.println("Il numero deve essere di 10 cifre!");
				Numero=scan.nextLine();
			}
			else {	
				System.out.println("Inserisci il numero della persona:");
				Numero=scan.nextLine();
			}
			lun=Numero.length();
            i++;
		}while(lun != 10);
		String Mailins;
		do {
			System.out.println("Insersci la email: ");
			Mailins=scan.nextLine();
			
		}while(!Mailins.contains("@")&&!Mailins.contains(".") );
		Mail=Mailins;
	}
	
	public void Visualizza() {
		System.out.println("Nome: "+Nome);
		System.out.println("Cognome: "+Cognome);
		System.out.println("Numero: "+Numero);
		System.out.println("Email: "+Mail);
	}
	
	public  String  toString () {
		String s;
		s= "Nome: "+Nome;
		s = s +  " \n Cognome: "  + Cognome;
		s = s +  " \n Numero: "  + Numero;
		s = s +  " \n Email: " + Mail;
		return s;
	}

	public static void main(String[] args) {
        Persona p=new Persona();
		// TODO Auto-generated method stub

		p.Inserisci();
		p.Visualizza();

	}

}
