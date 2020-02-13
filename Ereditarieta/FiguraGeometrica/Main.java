package figuraGeometrica;

/**
 * Main
 *
 * @author gbfactory
 * @version 1.0
 * @since 13/02/2020
 */

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica v[] = new FiguraGeometrica[3];

        v[0] = new Quadrato(3);
        v[0].visualizza();

        v[1] = new Rettangolo(3, 6);
        v[1].visualizza();

        v[2] = new Cerchio(3);
        v[2].inserisci();

    }

}
