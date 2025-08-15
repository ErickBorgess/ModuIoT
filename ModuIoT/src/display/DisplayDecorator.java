package display;

import core.Sensor;
import core.Atuador;
import java.util.List;

public abstract class DisplayDecorator implements Display {
    protected final Display interno;

    protected DisplayDecorator(Display interno) {
        this.interno = interno;
    }

    public void mostrar(List<Sensor> sensores, List<Atuador> atuadores) {
        interno.mostrar(sensores, atuadores);
    }
}
