import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        } else{
            System.out.println("O dicionario esta vazio!");
        }
    }
    public void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        } else{
            System.out.println("O dicionario esta vazio!");
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if(definicao != null){
            return definicao;
        }
        return "Palavra nao encontrada no dicionario";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("algoritmo", "Conjunto de instrucoes para resolver um problema");
        dicionario.adicionarPalavra("compilador", "Programa que traduz codigo escrito para linguagem de maquina");
        dicionario.adicionarPalavra("recursao", "Tecnica de programacao onde uma funcao chama a si mesma");
        dicionario.adicionarPalavra("criptografia", "Processo de transformar informacao em formato ilegivel para proteger dados de usuarios");

        System.out.println("- Todas as palavras com suas descricoes: ");
        dicionario.exibirPalavras();
        System.out.println("-------------------------------");

        String definicaoCompilador = dicionario.pesquisarPorPalavra("compilador");
        System.out.println("- Impressao da palavra pesquisada com descricao: ");
        System.out.println("Palavra 'compilador + descricao: " + definicaoCompilador);
        System.out.println("-------------------------------");

        dicionario.removerPalavra("criptografia");
        System.out.println("- Impressao sem a palavra removida: ");
        dicionario.exibirPalavras();
        System.out.println("-------------------------------");

    }
}
