import java.util.Scanner;

public class Resto {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;

        n = lerN(n);

        verificarNumDivisivel(n);

    }

    public static int lerN(int n) {
        n = teclado.nextInt();
        return n;
    }

    public static void verificarNumDivisivel(int n) {
        for (int i = 0; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}
