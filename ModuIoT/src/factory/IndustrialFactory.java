package factory;

import java.util.ArrayList;
import java.util.List;

import core.Atuador;
import core.Sensor;
import devices.industrial.AtuadorRefrigeracaoMotor;
import devices.industrial.SensorTemperaturaIndustrial;

public class IndustrialFactory implements DispositivoFactory {
    public List<Sensor> criarSensores() {
        List<Sensor> sensores = new ArrayList<>();
        sensores.add(new SensorTemperaturaIndustrial());
        return sensores;
    }

    public List<Atuador> criarAtuadores() {
        List<Atuador> atuadores = new ArrayList<>();
        atuadores.add(new AtuadorRefrigeracaoMotor());
        return atuadores;
    }
}
