
//import java.util.Scanner;

public class Sequencia {
    //final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double sequancia = 1;
        sequancia = calcularSequanciaS(sequancia);
        impirmirSequancia(sequancia);
    }

    public static double calcularSequanciaS(double sequancia) {
        for (int i = 2; i <= 100; i++) {
            sequancia += 1.00 / i;
        }
        return sequancia;
    }

    public static void impirmirSequancia(double sequancia) {
        System.out.printf("%.2f", sequancia);
        System.out.println();
    }

}