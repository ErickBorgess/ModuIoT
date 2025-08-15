package factory;

import java.util.List;
import core.Atuador;
import core.Sensor;

public interface DispositivoFactory {
    List<Sensor> criarSensores();
    List<Atuador> criarAtuadores();
}
