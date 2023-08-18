import java.util.Scanner;

public class ParImpPosiNega {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;

        int contarPositivos = 0;
        int contarNegativos = 0;
        int contarPares = 0;
        int contarImpares = 0;

        do {
            x = lerX(x);

            contarPares = verificarPares(contarPares, x);
            contarImpares = verificarImpares(contarImpares, x);
            contarPositivos = verificarPositivos(contarPositivos, x);
            contarNegativos = verificarNegativos(contarNegativos, x);

        } while (x < 5);
        
        imprimirResultado(contarImpares, contarNegativos, contarPares, contarPositivos);

    }

    public static int lerX(int x) {
        x = teclado.nextInt();
        return x;
    }

    public static void imprimirResultado(int contarImpares, int contarNegativos, int contarPares, int contarPositivos) {

        System.out.println(contarPositivos + " valor(es) positivo(s)");
        System.out.println(contarNegativos + " valor(es) negativo(s)");
        System.out.println(contarImpares + " valor(es) impar(es)");
        System.out.println(contarPares + " valor(es) par(es)");
        System.out.println();
    }

    // pares
    public static int verificarPares(int contarPares, int x) {
        if (x % 2 == 0) {
            contarPares++;
        }
        return contarPares;
    }

    // negativo
    public static int verificarImpares(int contarImpares, int x) {
        if (x % 2 != 0) {
            contarImpares++;
        }
        return contarImpares;
    }

    // positivos
    public static int verificarPositivos(int contarPositivos, int x) {
        if (x > 0) {
            contarPositivos++;
        }
        return contarPositivos;
    }

    // negativo
    public static int verificarNegativos(int contarNegativos, int x) {
        if (x < 0) {
            contarNegativos++;
        }
        return contarNegativos;
    }

}