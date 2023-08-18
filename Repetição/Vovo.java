import java.util.Scanner;
public class Vovo {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 0; //dias
        int s = 0; //saldo da conta no inicio
        int saldo;
        int mov = 0;

        n = lerN(n);
        s = lerS(s);

        saldo = s;

        for (int i = 0; i < n; i++) {
            mov = lerMov(mov);
            s += mov;

            if (s < saldo) {
                saldo = s;
            }
        }
        imprimirSaldo(saldo);
    }
    public static int lerN(int n) {
        do {
            n = LER.nextInt();
        } while (n <= 1 && n >= 30);
        return n;
    }
    public static int lerS(int s) {
        do {
            s = LER.nextInt();
        } while (s <= Math.pow(-10, 3) && s >= Math.pow(10, 3));
        return s;
    }
    public static int lerMov(int mov) {
        do {
            mov = LER.nextInt();
        } while (mov <= Math.pow(-10, 3) && mov >= Math.pow(10, 3));
        return mov;
    }
    public static void imprimirSaldo(int saldo) {
        System.out.println(saldo);
    }
}