import java.net.InetAddress;
import java.net.UnknownHostException;

public class Esempio2 {
    public static void main(String args[]) {
        try {
            InetAddress ind1 = InetAddress.getByName("www.iiseuganeo.cloud");
            System.out.println("Indirizzo iiseuganeo.cloud " + ind1);

            InetAddress ind2 = InetAddress.getByName("www.euganeortv.cloud");
            System.out.println("Indirizzo euganortv.cloud " + ind2);

            InetAddress ind3 = InetAddress.getByName("www.gbfactory.net");
            System.out.println("Indirizzo gbfactory.net " + ind3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
