package display;

import core.Sensor;
import core.Atuador;
import util.Ansi;
import java.util.List;

public class TemaClaroDisplay extends DisplayDecorator {
    public TemaClaroDisplay(Display interno) {
        super(interno);
    }

    public void mostrar(List<Sensor> sensores, List<Atuador> atuadores) {
        System.out.print(Ansi.BG_BRANCO + Ansi.PRETO);
        System.out.println("[TEMA CLARO]");
        super.mostrar(sensores, atuadores);
        System.out.print(Ansi.RESET);
    }
}
