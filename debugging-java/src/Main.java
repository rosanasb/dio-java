public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a(); //chama o metodo a
        System.out.println("Finalizou do programa no método main.");
    }
    //esta omitido o public que eh default
    static void a() {
        System.out.println("Entrou no método a.");
        b(); // chama o metodo b
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        //imprime o stack trace do metodo c
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
    //so quando finaliza o c voce pode finalizar os outros, um depende do outro
    //stack trace deve ser lida de baixo para cima. 
    //quando chega no metodo c ele comeca a desempilhar
}
