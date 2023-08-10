import java.util.Scanner;
public class NumPositivo {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int contar = 0;
        float x = 0f;

        imprimirResposta(contar, x);
    }
    public static void imprimirResposta(int contar, float x) {
        for(int i = 0; i < 6; i++ ){
            x = LER.nextFloat();
            if (x > 0) contar++;
        } 
        System.out.println(contar + " valores positivos");  
    }
}
