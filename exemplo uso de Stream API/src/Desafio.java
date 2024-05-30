//Imprimindo os numeros em ordem 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                                                .sorted()
                                                .collect(Collectors.toList());

        numeros.stream()
            .sorted()
            .forEach(System.out::println);
    }
}