public class Operacoes {
    public static void main(String[] args) {
        double n1 = 10.0f;
        double n2 = 3.0f;
        double resultado;


        //Operadores: + - * / %
        resultado = n1 + n2;
        System.out.println("A soma de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);
        System.out.println("----------------------");

        resultado = n1 - n2;
        System.out.println("A subitração de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);
        System.out.println("----------------------");

        resultado = n1 * n2;
        System.out.println("A multiplicação  de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);
        System.out.println("----------------------");

        resultado = n1 / n2;
        System.out.println("A divisão de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);
        System.out.println("----------------------");

        resultado = n1 % n2;
        System.out.println("A o resto da divisao de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);
        System.out.println("----------------------");

        resultado = Math.pow(n1, n2);
        System.out.println("A potencia de " +n1+ " " + "e" + " " +n2+ " eh: " + resultado);

        //resultado = Math.sqrt(resultado);
    }
}
