package display;

import java.util.List;
import core.Atuador;
import core.Sensor;

public interface Display {
    void mostrar(List<Sensor> sensores, List<Atuador> atuadores);
}
