package devices.industrial;

import core.SensorBase;

public class SensorTemperaturaIndustrial extends SensorBase{
    public String getTipo() {
        return "Sensor de Temperatura Industrial";
    }

    public double lerDados() {
        return 98.6;
    }

}
