public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        //cenario 1
        /*int nota = 4;

		String resultado = nota >=7 ? "Aprovado" : "Reprovado";

		System.out.println(resultado);*/

        //cenario 2
        int nota = 3;
        
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
