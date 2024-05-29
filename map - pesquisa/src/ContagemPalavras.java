import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;
    
    public ContagemPalavras(){
        this.palavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        } else{
            System.out.println("O Map esta vazio!");
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorFrequencia = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            if(entry.getValue() > maiorFrequencia){
                maiorFrequencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Caderno", 1);
        contagemPalavras.adicionarPalavra("Computador", 9);
        contagemPalavras.adicionarPalavra("Celular", 7);
        contagemPalavras.adicionarPalavra("Caneta", 2);
        contagemPalavras.adicionarPalavra("Mesa", 5);

        System.out.println("- Contagem das palavras adicionadas: ");
        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println("-----------------------------------");

        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("- Palavra mais frequente: ");
        System.out.println(palavraMaisFrequente);
        System.out.println("-----------------------------------");
    }
}
