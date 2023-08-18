import java.util.Scanner;

public class Intervalo {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numCasos = 0;
        int valor = 0;
        int in = 0;
        int out = 0;

        numCasos = lerNumCasos(numCasos);

        for (int i = 0; i < numCasos; i++) {
            valor = lerValor(valor);
            in = verificarIntervaloIn(valor, in, numCasos);
            out = verificarIntervaloOut(valor, out, numCasos);

        }
        imprimirIntervalo(in, out);
    }

    public static int lerNumCasos(int numCasos) {
        do {
            numCasos = teclado.nextInt();
        } while (numCasos > 10000);
        return numCasos;
    }

    public static int lerValor(int valor) {
        do {
            valor = teclado.nextInt();
        } while (valor < Math.pow(-10, 7) || valor > Math.pow(10, 7));
        return valor;
    }

    public static int verificarIntervaloIn(int valor, int in, int numCasos) {
        if (valor >= 10 && valor <= 20) {
            in++;
        }
        return in;
    }

    public static int verificarIntervaloOut(int valor, int out, int numCasos) {
        if (valor < 10 || valor > 20) {
            out++;
        }
        return out;
    }

    public static void imprimirIntervalo(int in, int out) {
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
