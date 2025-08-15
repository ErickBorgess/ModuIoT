package display;

import java.util.ArrayList;
import java.util.List;

public class Painel implements ElementoVisual {
    private final List<ElementoVisual> filhos = new ArrayList<>();

    public Painel adicionar(ElementoVisual el) {
        filhos.add(el);
        return this;
    }

    public void exibir() {
        for (ElementoVisual el : filhos) {
            el.exibir();
        }
    }
}
