public class Operadores {
    public static void main(String[] args) {
        //Aritimeticos

        String nomeCompleto = "LINGUAGEM " + " JAVA";

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao); 

        //Unários
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = + numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero); 

        //x repetição
        //int numero = 5;
        
        numero = numero + 2;

        numero++;   // numero + 1

        System.out.println(numero -- );

        System.out.println(numero); 

        // negação; inverte valor
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);
    }
}
