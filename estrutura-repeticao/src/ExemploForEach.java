public class ExemploForEach {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        System.out.println("Alunos: ");
        //mais otimizado, abreviamos a obtencao dos indices
        for(String aluno : alunos) {
            System.out.println("\t - " + aluno);
        }
    }
}

