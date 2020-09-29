import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero maggiore di 0: ");
        int numero = scan.nextInt();

        System.out.println("Fibonacci " + numero + ": " + fibonacci(numero));
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
