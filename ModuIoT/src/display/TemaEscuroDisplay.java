package display;

import core.Sensor;
import core.Atuador;
import util.Ansi;
import java.util.List;

public class TemaEscuroDisplay extends DisplayDecorator {
    public TemaEscuroDisplay(Display interno) {
        super(interno);
    }

    public void mostrar(List<Sensor> sensores, List<Atuador> atuadores) {
        System.out.print(Ansi.BG_PRETO + Ansi.BRANCO);
        System.out.println("[TEMA ESCURO]");
        super.mostrar(sensores, atuadores);
        System.out.print(Ansi.RESET);
    }
}
