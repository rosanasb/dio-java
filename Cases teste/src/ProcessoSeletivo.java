import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for(String candidato: candidatos){
            entrandoContato(candidato);
        }
    }
    public static void entrandoContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuaTentando = !atendeu;
        }while(continuaTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimos contato com o " + candidato + " na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("Nao conseguimos contato com o " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + "realizadas");
        }
    }
    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    public static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo os Candidatos com o seu respectivo indice ");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de indice " + (indice + 1) + "eh: " + candidatos[indice] );
        }
    }
    public static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtuais < candidatos.length){
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidato %s solicitou este valor de salario: %.2f\n", candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }
    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
