import java.util.HashSet;
import java.util.Set;

public class ListaTarefa{
    private Set<Tarefa> tarefasSet;

    public ListaTarefa(){
        this.tarefasSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaRemover);
        } else{
            System.out.println("O conjunto esta vazio!");
        }
        if(tarefaRemover == null){
            System.out.println("Tarefa nao encontrada!");
        }
    }
    public void exibirTarefa(){
        if(!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        } else{
            System.out.println("Tarefa nao encontrada!");
        }
    }
    public int contarTarefas(){
        return tarefasSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefasSet){
            if(t.isConcuida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefasSet){
            if(!t.isConcuida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcarPendente = null;
        for(Tarefa t : tarefasSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaMarcarPendente = t;
                break;
            }
        }
        if(tarefaMarcarPendente != null){
            if(tarefaMarcarPendente.isConcuida()){
                tarefaMarcarPendente.setConcluida(false);
            }
        } else{
            System.out.println("Tarefa nao encontrada no conjunto!");
        }
    }
    public void limparListaTarefas(){
        if(tarefasSet.isEmpty()){
            System.out.println("O conjunto esta vazio!");
        } else{
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Passear com meus cachorros");
        listaTarefas.adicionarTarefa("Fazer almoco");
        listaTarefas.adicionarTarefa("Tomar banho");
        listaTarefas.adicionarTarefa("Abastecer o carro");
        listaTarefas.adicionarTarefa("Enviar email");

        System.out.println("- Todas as tarefas do conjunto: ");
        listaTarefas.exibirTarefa();
        System.out.println("----------------------------");

        listaTarefas.removerTarefa("Tomar banho");
        System.out.println("- Todas as tarefas removendo 'Tomar banho':");
        listaTarefas.exibirTarefa();
        System.out.println("----------------------------");

        System.out.println("- Numero de Tarefas no conjunto: ");
        System.out.println(listaTarefas.contarTarefas());
        System.out.println("----------------------------");

        System.out.println("- Numero de tarefas pendentes: ");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println("----------------------------");

        listaTarefas.marcarTarefaConcluida("Fazer almoco");
        listaTarefas.marcarTarefaConcluida("Passear com meus cachorros");
        System.out.println("- Tarefas concluida: ");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println("----------------------------");

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.marcarTarefaPendente("Abastecer o carro");
        System.out.println("- Tarefas pendentes: ");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println("----------------------------");

        listaTarefas.limparListaTarefas();
        System.out.println("- Todas as tarefas foram concluidas!\nConjunto esta limpo!");
        listaTarefas.exibirTarefa();
        System.out.println("----------------------------");

    }
}