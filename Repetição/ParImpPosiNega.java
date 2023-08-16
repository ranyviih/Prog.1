import java.util.Scanner;

public class ParImpPosiNega {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        float x = 0f;

        int contarPositivos = 0;
        int contarNegativos = 0;
        int contarPares = 0;
        int contarImpares = 0;

        contarPares = verificarPares(contarPares);
        contarImpares = verificarImpares(contarImpares);
        contarPositivos = verificarPositivos(contarPositivos, x);
        contarNegativos = verificarNegativos(contarNegativos, x);
        imprimirResultado(contarImpares,contarNegativos,contarPares,contarPositivos);
        
    }

    public static void imprimirResultado(int contarImpares, int contarNegativos, int contarPares, int contarPositivos) {
        
        System.out.println(contarPositivos + " valor(es) positivo(s)");
        System.out.println(contarNegativos + " valor(es) negativo(s)");
        System.out.println(contarImpares + " valor(es) impar(es)");
        System.out.println(contarPares + " valor(es) par(es)");
        //System.out.println();
    }

    // pares
    public static int verificarPares(int contarPares) {
        for (int p = 0; p < 5; p++) {
            if (p % 2 == 0){
                contarPares++;
            }
        }
        return contarPares;
    }

    // negativo
    public static int verificarImpares(int contarImpares) {
        for (int a = 0; a < 5; a++) {
            if (a % 2 == 1 || a % 2 == -1){
                contarImpares++;
            }
        }
        return contarImpares;
    }

    // positivos
    public static int verificarPositivos(int contarPositivos, float x) {
        for (int b = 0; b < 5; b++) {
            x = teclado.nextFloat();
            if (x > 0){
                contarPositivos++;
            }
        }
        return contarPositivos;
    }

    // negativo
    public static int verificarNegativos(int contarNegativos, float x) {
        for (int i = 0; i < 5; i++) {
            x = teclado.nextFloat();
            if (x < 0){
                contarNegativos++;
            }
        }
       return contarNegativos;
    }

}