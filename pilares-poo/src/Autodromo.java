public class Autodromo {
    public static void main(String[] args) {
        Carro dodge = new Carro();
        dodge.setChassi("5689747755");
        dodge.ligar();

        Moto yamaha = new Moto();
        yamaha.setChassi("569874321");
        yamaha.ligar();
        //muda o comportamento de acordo com o que tu coloca, mantem o metodo dorrespondente, mas nao sabe qual sera o comportamento
        Veiculo coringa = yamaha; //dodge
        coringa.ligar();
    }
}
