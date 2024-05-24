

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
//import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
//import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        /*Impressora impressora = new DeskJet();
        impressora.imprimir();

        Impressora impressora1 = new LaserJet();
        impressora1.imprimir();

        Impressora impressora2 = new EquipamentoMultifuncional();
        impressora2.imprimir();*/
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
