import java.util.Scanner;

public class Pandorgas {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int tamBambu = 0;
        int tamBambu2 = 0;
        int quantPipas = 0;
        int resultado = 0;

        quantPipas = lerQuantPipas(quantPipas);

        for (int i = 0; i < quantPipas; i++) {

            tamBambu = lerTamBambu(tamBambu);
            tamBambu2 = lerTamBambu2(tamBambu2);

            resultado = calcularPandorgas(tamBambu, tamBambu2, quantPipas, resultado);
            imprimirResultado(resultado);
        }

    }

    public static void imprimirResultado(int resultado) {
        System.out.println(resultado + " cm2");
    }

    public static int calcularPandorgas(int tamBambu, int tamBambu2, int quantPipas, int resultado) {

        resultado = (tamBambu * tamBambu2) / 2;

        return resultado;
    }

    public static int lerTamBambu(int tamBambu) {
        do {
            tamBambu = teclado.nextInt();
        } while (tamBambu < 10 || tamBambu > 100);
        return tamBambu;
    }

    public static int lerTamBambu2(int tamBambu2) {
        do {
            tamBambu2 = teclado.nextInt();
        } while (tamBambu2 < 10 || tamBambu2 > 100);
        return tamBambu2;
    }

    public static int lerQuantPipas(int quantPipas) {
        quantPipas = teclado.nextInt();
        return quantPipas;
    }
}
