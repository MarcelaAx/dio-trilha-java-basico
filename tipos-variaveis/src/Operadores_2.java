public class Operadores_2 {
    public static void main(String[] args) {
        //Ternário

        int a, b;
        a = 5;
        b = 6;

        //String resultado = a == b ? "verdadeiro" : "falso";
        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        //Relacionais
        String nomeUm = "MARCELA";
        String nomeDois = new String ("MARCELA");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é Verdadeira!");
        }

          if(numero1 == numero2) {
            System.out.println("A nossa condição é Verdadeira!");  // não vai imprimir
        }

        System.out.println("O numero1 é igual ao numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("O numero1 é maior do que numero2? " + simNao);

        //Lógicos
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

    }
}
