package devices.industrial;

import devices.SensorBase;

public class SensorTemperaturaIndustrial extends SensorBase{
    public String getTipo() {
        return "Sensor de Temperatura Industrial";
    }

    public double lerDados() {
        return 56.7;
    }

}
