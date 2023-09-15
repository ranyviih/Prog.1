import java.util.Scanner;

public class ExVetor {
    final static Scanner teclado = new Scanner(System.in);

    public static int lerInt() {
        int valor;
        valor = teclado.nextInt();
        return valor;
    }

    public static void imprimirVetorInteiro(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("["+ i + "] : "+ vetor[i]);
        }
    }

    public static int encontarMaior(int[] vetor) {   
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
       return maior;
    }
    public static int encontarMenor(int[] vetor) {   
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
       return menor;
    }


    public static int[] lerVetorInteiro(int tamanho) {
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInt();
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetor;
        vetor = lerVetorInteiro(5);

        //imprimirVetorInteiro(vetor);
       int maior = encontarMaior(vetor);
       System.out.println("Maior: " + maior);

       int menor = encontarMenor(vetor);
       System.out.println("Menor: " + menor);
    }
}