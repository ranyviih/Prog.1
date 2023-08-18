import java.util.Scanner;

public class Senha {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        final int SENHA = 2002;
        boolean acesso = false;

        while(acesso == false){
            int lerSenha = lerS();
            acesso = Verificar(lerSenha, SENHA);
        }

    }
    public static int lerS() {
        int lerSenha = 0;
        lerSenha = LER.nextInt();

        return lerSenha;

    }
    public static boolean Verificar(int lerSenha, final int SENHA){
        
        if(lerSenha != SENHA){
            System.out.println("Senha Invalida");
            return false;
        }else{
            System.out.println("Acesso Permitido");
            return true;
        }
    }
   
}