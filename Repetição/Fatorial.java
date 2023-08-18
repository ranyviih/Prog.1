import java.util.Scanner;

public class Fatorial {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int  n = 0;
        int fatorial = 1;

        n = lerN(n);

        fatorial = verificarFatorial(n, fatorial);
        imprimirFatorial(fatorial);
    }
    public static void imprimirFatorial(int fatorial) {
        System.out.println(fatorial);
    }

    public static int verificarFatorial(int n, int fatorial) {
        for (int i = 1; i < n; i++) {
          fatorial *= i;
        }
        return fatorial;
    }

    public static int lerN(int n) {
        do {
            n = teclado.nextInt();
        } while (n < 0 || n > 13);
        return n;
    }
}
