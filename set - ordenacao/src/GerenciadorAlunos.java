import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public void removerAlunoMatricula(long matricula){
        Alunos alunosRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if(a.getMatricula() == matricula){
                    alunosRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunosRemover);
        } else{
            throw new RuntimeException("O conjunto esta vazio!");
        }
        if(alunosRemover == null){
            System.out.println("Matricula nao encontrada!");
        }
    }
    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        } else{
            System.out.println("O conjunto esta vazio!");
        }
    }
    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunosSet.isEmpty()){
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else{
            System.out.println("O conjunto esta vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Rosana", 5698743L , 8.5);
        gerenciadorAlunos.adicionarAluno("Luiza", 698743L, 8.3);
        gerenciadorAlunos.adicionarAluno("Leticia", 159874L, 9.1);
        gerenciadorAlunos.adicionarAluno("Renata", 153247L, 8.9);

        System.out.println("- Todos os Alunos: ");
        System.out.println(gerenciadorAlunos.alunosSet);
        System.out.println("-----------------------------");

        gerenciadorAlunos.removerAlunoMatricula(00L);
        gerenciadorAlunos.removerAlunoMatricula(153247L);
        System.out.println("- Todos os Alunos, exceto removidos: ");
        System.out.println(gerenciadorAlunos.alunosSet);
        System.out.println("-----------------------------");

        System.out.println("- Alunos por Nome: ");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("-----------------------------");

        System.out.println("- Alunos por nota: ");
        gerenciadorAlunos.exibirAlunosPorNota();
        System.out.println("-----------------------------");
    }
}