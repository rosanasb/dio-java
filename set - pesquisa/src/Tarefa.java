public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public boolean isConcuida(){
        return concluida;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    public String toString(){
        return "Tarefa{" + "descricao = " + descricao + "\'" + ", concluida = " + concluida + "}"; 
    }
}
