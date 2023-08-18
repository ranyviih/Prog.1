import java.util.Scanner;

public class Idades {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        int soma = 0;
        double media = 0;

        do {

            numero = lerNumero(numero);

            soma = verificandoNumPositivo(numero, contador, soma);
            media = calculandoIdades(soma, contador);
            imprimirMediaIdade(media);

        } while (numero >= 0);

    }

    public static void imprimirMediaIdade(double media) {
        System.out.printf("%.2f",media);
    }

    public static double calculandoIdades(int soma, int contador) {
        double media = 0;

        media = soma / contador;

        return media;
    }

    public static int lerNumero(int numero) {
        numero = teclado.nextInt();
        return numero;
    }

    public static int verificandoNumPositivo(int numero, int contador, int soma) {

        if (numero >= 0) {
            contador++;
            soma += numero;
        }
        return soma;
    }
}
