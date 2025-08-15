package register;

import java.util.List;
import core.Atuador;
import core.Sensor;

public class DadosSistema {
    private List<Sensor> sensores;
    private List<Atuador> atuadores;

    public DadosSistema(List<Sensor> sensores, List<Atuador> atuadores) {
        this.sensores = sensores;
        this.atuadores = atuadores;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public List<Atuador> getAtuadores() {
        return atuadores;
    }
}
