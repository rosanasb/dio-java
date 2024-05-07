public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //erro, ou muda par int ou faz um cast

        //valores final CAIXA ALTA
        final double VALOR_DE_PI = 3.14;
    }
}
