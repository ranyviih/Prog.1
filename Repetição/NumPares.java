import java.util.Scanner;
public class NumPares {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        imprimirResposta();

    }
    public static void imprimirResposta() {
        for (int i = 1; i <= 100; i++) {
    		if (i % 2 == 0)
            System.out.println(i);
    	}
    }       
}