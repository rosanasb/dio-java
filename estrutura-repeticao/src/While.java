//biblioteca para trabalhar com numeros aleatorios
import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
	    double mesada = 50.0;
        //enquanto a mesada for > 0 vai adicionando doce no carrinho
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Doce do valor: %.2f Adicionado no carrinho\n" ,valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
