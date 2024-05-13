import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //nao consegue imprimir, tem caracter indevido
        //valueOf tem a finalidade de pegar uma string e converter em double
        //Number valor = Double.valueOf("a1.75");
        //System.out.println(valor);
        Number valor;
        try{
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
}
