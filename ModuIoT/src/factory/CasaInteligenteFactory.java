package factory;

import java.util.ArrayList;
import java.util.List;

import core.Atuador;
import core.Sensor;
import devices.domestico.AtuadorAr;
import devices.domestico.AtuadorLuz;
import devices.domestico.SensorLuminosidadeDomestico;
import devices.domestico.SensorTemperaturaDomestico;

public class CasaInteligenteFactory implements DispositivoFactory{
    public List<Sensor> criarSensores() {
        List<Sensor> sensores = new ArrayList<>();
        sensores.add(new SensorTemperaturaDomestico());
        sensores.add(new SensorLuminosidadeDomestico());
        return sensores;
    }

    public List<Atuador> criarAtuadores() {
        List<Atuador> atuadores = new ArrayList<>();
        atuadores.add(new AtuadorAr());
        atuadores.add(new AtuadorLuz());
        return atuadores;
    }
}
