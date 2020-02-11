package ereditarieta;

public class MainQuadrato {

    public static void main(String[] args) {

        // Dichiarazione di un Quadrato con costruttore di default
        Quadrato q = new Quadrato();
        q.visualizza();

        // Dichiarazione di un QuadratoAColori con costruttore di default
        QuadratoAColori qc = new QuadratoAColori();
        qc.visualizza();

        // Dichiarazione di un QuadratoAColori con costruttore con parametri
        QuadratoAColori qc2 = new QuadratoAColori(3, "Rosso");
        qc2.visualizza();

        // Utilizzo del metodo equals
        if (qc.equals(qc2)) {
            System.out.println("I due quadrati sono uguali");
        } else {
            System.out.println("I due quadrati sono diversi");
        }

        // Utilizzo del metodo compareTo
        if (qc.compareTo(qc2) == 0) {
            System.out.println("I due quadrati sono uguali");
        } else if (qc.compareTo(qc2) == 1) {
            System.out.println("Il primo quadrato è maggiore del secondo.");
        } else {
            System.out.println("Il secondo quadrato è maggiore del primo.");
        }

    }

}
