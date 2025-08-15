package devices.domestico;

import devices.SensorBase;

public class SensorTemperaturaDomestico extends SensorBase {
    public String getTipo() {
        return "Sensor de Temperatura Doméstico";
    }

    public double lerDados() {
        return 22.5;
    }

}
