public class Operadores {
    public static void main(String[] args) throws Exception {
        //Operadores Aritmeticos
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
        //Operadores Unarios
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

        int a, b;

        a = 5;
        b = 6;
        String resultado;
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        //Operadores ternarios
        //mesmo, mas com operador ternario
        String resultado1 = (a==b) ? "verdadeiro" : "falso";

        System.out.println(resultado1);
        //Operadores realcionais
        int numero3 = 1;
        int numero2 = 2;

        if(numero3 > numero2)
	        System.out.println("Numero 1 maior que numero 2");
        if(numero3 < numero2)
	        System.out.println("Numero 1 menor que numero 2");
        if(numero3 >= numero2)
	        System.out.println("Numero 1 maior ou igual que numero 2");
        if(numero3 <= numero2)
	        System.out.println("Numero 1 menor ou igual que numero 2");
        if(numero3 != numero2)
	        System.out.println("Numero 1 é diferente de numero 2");

        String nomeUm = "Renata";
        String nomeDois = new String("Renata");
        //equals compara o conteudo de dois objetos sao iguais
        System.out.println(nomeUm.equals(nomeDois));
        //Operadores logicos
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2)
	        System.out.print("Os dois valores precisam ser verdadeiros");
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        int numero4 = 1;
        int numero5 = 1;
        if(numero4== 2 && numero5 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero4);
        System.out.println("O numero 2 agora é " + numero5);
    }
}
