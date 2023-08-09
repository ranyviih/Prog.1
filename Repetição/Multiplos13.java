import java.util.Scanner;

public class Multiplos13 {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int soma = 0;

        x = lerX(x);
        y = lerY(y);

        soma = calcularSoma(x, y, soma);

        imprimirSoma(soma);
    }

    public static void imprimirSoma(int soma) {
        System.out.println(soma);
    }

    public static int calcularSoma(int x, int y, int soma) {
        if (x > y) {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        return soma;
    }

    public static int lerX(int x) {
        x = teclado.nextInt();
        return x;
    }

    public static int lerY(int y) {
        y = teclado.nextInt();
        return y;
    }
}