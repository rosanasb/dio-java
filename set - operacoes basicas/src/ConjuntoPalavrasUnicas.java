import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra nao encontrada!");
            } 
        }else {
            System.out.println("O conjunto esta vazio!");
        }
    }
    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        } else{
            System.out.println("O conjunto esta vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Celular");
        conjuntoPalavras.adicionarPalavra("Programacao");
        conjuntoPalavras.adicionarPalavra("Java");
        conjuntoPalavras.adicionarPalavra("Estudar");
        conjuntoPalavras.adicionarPalavra("Computador");

        System.out.println("- Todas as palavras adicionadas no Set: ");
        conjuntoPalavras.exibirPalavrasUnicas();
        System.out.println(" -------------------------------- ");

        conjuntoPalavras.removerPalavra("Estudar");
        System.out.println("- Retirando a palavra 'Estudar' do conjunto: ");
        conjuntoPalavras.exibirPalavrasUnicas();
        System.out.println(" -------------------------------- ");

        System.out.println("A palavra 'Java' esta no conjunto? " + conjuntoPalavras.verificarPalavra("Java"));
        System.out.println(" -------------------------------- ");

        System.out.println("A palavra 'Estudar' esta no conjunto? " + conjuntoPalavras.verificarPalavra("Estudar"));
        System.out.println(" -------------------------------- ");
    }
}
