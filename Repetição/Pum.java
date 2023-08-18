import java.util.Scanner;

public class Pum {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        n = lerN(n);
        int contador = 1;

        definirPum(n, contador);
    }

    public static int lerN(int n) {
        n = teclado.nextInt();
        return n;
    }

    public static void definirPum(int n, int contador) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println("PUM");
            contador++;
        }
    }
}
