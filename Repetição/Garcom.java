import java.util.Scanner;

public class Garcom {
    final static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int latas = 0;
        int copos = 0;
        int quebrados = 0;

        int bandejas = 0;
        bandejas = lerBandeja(bandejas);

        for (int i = 0; i < bandejas; i++) {
            latas = lerLatas(latas);
            copos = lerCopos(copos);

            quebrados = verificarNumCoposQuebrados(latas, copos, bandejas, quebrados);

        }

        imprimirResultado(quebrados);

    }

    public static int lerBandeja(int bandejas) {
        do {
            bandejas = teclado.nextInt();
        } while (bandejas < 1 || bandejas > 100);

        return bandejas;
    }

    public static int lerLatas(int latas) {
        do {
            latas = teclado.nextInt();
        } while (latas < 0 || latas > 100);
        return latas;
    }

    public static int lerCopos(int copos) {
        do {
            copos = teclado.nextInt();
        } while (copos < 0 || copos > 100);
        return copos;
    }

    public static int verificarNumCoposQuebrados(int copos, int latas, int bandejas, int quebrados) {
        for (int i = 0; i < bandejas; i++) {
            if (latas > copos) {
                quebrados += copos;
            } 

        }
        return quebrados;
    }

    public static void imprimirResultado(int quebrados) {
        System.out.println(quebrados);
    }

}
