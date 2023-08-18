import java.util.Scanner;

public class Fibi {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;

        n = lerN(n);

        final int fib0 = 0;
        final int fib1 = 1;
        int prox = 0;

        verificandoSerieFib(n, fib0, fib1, prox);
    }

    public static void verificandoSerieFib(int n, int fib0, int fib1, int prox) {
        for (int i = 0; i <= n; i++) {

            System.out.print(fib0 + " ");
            prox = fib0 + fib1;
            fib0 = fib1;
            fib1 = prox;

        }
    }

    public static int lerN(int n) {
        do {
            n = teclado.nextInt();
        } while (n < 0 || n > 46);
        return n;
    }
}