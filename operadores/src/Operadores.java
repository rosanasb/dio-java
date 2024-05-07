public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        /*Apartir do momento que ele detecta um caracter
         * ele deixa de fazer a soma*/
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);

        //nao funciona para mudar para positivo novamente
        numero = + numero;
        System.out.println(numero);
        //para funcionar eh necessario fazer o seguinte:
        numero = numero * -1;
        System.out.println(numero);

        // repeticao
        int numero1 = 5;
        numero1 += 1;
        System.out.println(numero1);
        //Se fizer o print assim:
        System.out.println(numero1++);
        //nao altera o valor, pois o incremento foi feito depois
        System.out.println(numero1);//aqui aparece o incremento
        //tem que colocar o incremento antes
        System.out.println(++ numero1);

        boolean variavel = true;
        System.out.println(! variavel);
        variavel = !variavel;
        System.out.println(variavel);
    }
}
