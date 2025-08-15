package devices.domestico;

import core.SensorBase;

public class SensorTemperaturaDomestico extends SensorBase {
    public String getTipo() {
        return "Sensor de Temperatura Doméstico";
    }

    public double lerDados() {
        return 27;
    }

}
