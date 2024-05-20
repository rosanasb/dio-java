public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro ed = EstadoBrasileiro.PARANA;
        System.out.println(ed.getSigla() + " - " + ed.getNome() + " - " + ed.getNomeMaiusculo());
    }
}
