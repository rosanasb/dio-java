public class MinhaClasse {
    public static void main (String [] args){
        //Anatomia da Classe - Aula 01
        System.out.println("Oi Turma!");
        //Anatomia da Classe - Aula 02
        final String BR = "Brasil";
        System.out.println("My Country: " + BR); 
        //Anatomia da Classe - Aula 03
        String primeiroNome = "Rosana";
        String segundoNome = "Silva";
        int anoNascimento = 1988;
        System.out.printf("\tNome: %s\n\tAno de Nascimento: %d\n", primeiroNome, anoNascimento);
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
