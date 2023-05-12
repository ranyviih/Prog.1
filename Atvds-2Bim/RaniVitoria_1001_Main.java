import java.util.Scanner;
public class RaniVitoria_1001_Main {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){
        int A;
        int B;
        int X;

        A = lerA();
        B = lerB();
        
        X = calcX(A,B);

        imprimitResposta(X);

    }
    public static int lerA(){
        int a;
        a = LER.nextInt();
        return a;
    }
    public static int lerB(){
        int b;
        b = LER.nextInt();
        return b;
    }
    public static int calcX(int A, int B){
        int x;
        x = A + B;
        return x;
    }
    public static void imprimitResposta(int X) {
        System.out.println("X = " + X);
    }
}