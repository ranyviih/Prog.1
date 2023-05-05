public class PrintCadastro {
    public static void main(String[] args) {
        //Variaveis
        //tipo nome

        //Inteiro Ex: 8
        int idade;

        //Real Ex: 1.2
        float alturaMetros;
        double alturaPrecisa;

        //String (Texto)
        String nome;
        String sobrenome;

        //Caractere
        char sexo; 

        //Booleam
        boolean estudante;

        idade = 17;
        alturaMetros = 1.65f;
        nome = "Rani";
        sobrenome = "Vitoria";
        sexo = 'F';
        estudante = true;

        System.out.println("----------------------");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Sua altura: " + alturaMetros);
        System.out.println("Seu idade: " + idade);
        System.out.println("Seu sexo: " + sexo);
        System.out.println("Voce é um estudante? " + estudante);
        System.out.println("----------------------");
    }
}

//edentação