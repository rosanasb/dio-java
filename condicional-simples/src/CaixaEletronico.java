public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
        /*se o valorSolicitado for > saldo, o saldo continuara sendo o mesmo,
         * 25, nao e alterado.*/
        System.out.println(saldo);

    }
}