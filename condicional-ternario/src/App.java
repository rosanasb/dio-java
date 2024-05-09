public class App {
    public static void main(String[] args) throws Exception {
		int nota = 7;
        /*pega o nota e pergunta se (if) e >= 7?
         * if  se sim = Aprovado
         * else se nao = Reprovado
         */
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        nota = 6;
		resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperacao" : "Reprovado";
		System.out.println(resultado);
    }
}
