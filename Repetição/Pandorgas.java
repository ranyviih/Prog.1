import java.util.Scanner;

public class Pandorgas {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int n = 0;
        int resultado = 0;

        n = lerN();
        for (int i = 0; i < n; i++) {
            x = lerX(x);
            y = lerY(y);
        }

        resultado = calcularPandorgas(x, y, n, resultado);
        imprimirResultado(resultado);
    }

    public static void imprimirResultado(int resultado) {
        System.out.println(resultado + " cm2");
    }

    public static int calcularPandorgas(int x, int y, int n, int resultado) {
        for (int i = 0; i <= n; i++) {
            resultado = (x * y) / 2;
        }
        return resultado;
    }

    public static int lerX(int x) {
        do {
            x = teclado.nextInt();
        } while (x < 10 || x > 100);
        return x;
    }

    public static int lerY(int y) {
        do {
            y = teclado.nextInt();
        } while (y < 10 || y > 100);
        return y;
    }

    public static int lerN() {
        int n = teclado.nextInt();
        return n;
    }
}
