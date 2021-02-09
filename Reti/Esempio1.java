import java.net.InetAddress;
import java.net.UnknownHostException;

public class Esempio1 {
    public static void main(String[] args) {
        try {
            InetAddress ind1 = InetAddress.getLocalHost();
            System.out.println("LOCAL HOST: " + ind1);

            InetAddress ind2 = InetAddress.getLoopbackAddress();
            System.out.println("LOOPBACK ADDRESS: " + ind2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
