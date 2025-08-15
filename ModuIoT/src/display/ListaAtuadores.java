package display;

import java.util.List;
import core.Atuador;

public class ListaAtuadores implements ElementoVisual {
    private final List<Atuador> atuadores;

    public ListaAtuadores(List<Atuador> Atuadores) {
        this.atuadores = Atuadores;
    }

    public void exibir() {
        System.out.println("Atuadores");
        for (Atuador a : atuadores) {
            System.out.println("  [->] " + a.getTipo() + " [" + (a.isLigado() ? "ON" : "OFF") + "]");
        }
    }
}
