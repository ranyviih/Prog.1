import java.util.Scanner;

public class Funcoes {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int n = 0;

        double r = 0;
        double b = 0;
        double c = 0;

        String nomeGanhador = null;

        n = lerN();

        for (int i = 0; i < n; i++) {

            x = lerX();
            y = lerY();

            r = calcularFuncRafael(x, y);
            b = calcularFuncBeto(x, y);
            c = calcularFuncCarlos(x, y);

            nomeGanhador = verficicarGanhador(r, b, c);

            imprimirGanhador(nomeGanhador);
        }
    }

    public static int lerN() {
        int n = 0;
        do {
            n = LER.nextInt();
        } while (n <= 0);
        // System.out.println("Valido!");
        return n;
    }

    public static int lerX() {
        int x = 0;
        do {
            x = LER.nextInt();
        } while (x <= 0 || x > 100);
        //System.out.println("x Valido!");
        return x;
    }

    public static int lerY() {
        int y = 0;
        do {
            y = LER.nextInt();
        } while (y <= 0 || y > 100);
        //System.out.println("y Valido!");
        return y;
    }

    public static double calcularFuncRafael(int x, int y) {
        double r = 0;
        r = (Math.pow((3 * x), 2)) + (Math.pow(y, 2));
        return r;
    }

    public static double calcularFuncBeto(int x, int y) {
        double b = 0;
        b = (2 * Math.pow(x, 2)) + (Math.pow((5 * y), 2));
        return b;
    }

    public static double calcularFuncCarlos(int x, int y) {
        double c = 0;
        c = (-100 * x) + Math.pow(y, 3);
        return c;
    }

    public static String verficicarGanhador(double r, double b, double c) {
        String nomeGanhador = null;

        if (r > b && r > c) {
            nomeGanhador = "Rafael";
        } else if (b > c) {
            nomeGanhador = "Beto";
        } else {
            nomeGanhador = "Carlos";
        }
        return nomeGanhador;
    }

    public static void imprimirGanhador(String nomeGanhador) {
        System.out.println(nomeGanhador + " ganhou");
    }

}