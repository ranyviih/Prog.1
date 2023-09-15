import java.util.Scanner;

public class SomaVetores {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vet1 = { 5, 2, 3 };
        int[] vet2 = { 5, 2, 3 };

        int[] soma ;
        soma = somaVetor(vet1, vet2);

        for (int i = 0; i < soma.length; i++) {
            System.out.println("A soma das posições "+ i + " : " + soma[i]);
        }

    }

    public static int[] somaVetor(int[] vet1, int[] vet2) {
        if (vet1.length != vet2.length) {
            return null;
        }

        int[] soma = new int[vet1.length];

        for (int i = 0; i < soma.length; i++) {
            soma[i] = vet1[i] + vet2[i];
        }
        return soma;
    }
}
