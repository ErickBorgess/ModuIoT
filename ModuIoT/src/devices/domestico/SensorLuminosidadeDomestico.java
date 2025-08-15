package devices.domestico;

import devices.SensorBase;

public class SensorLuminosidadeDomestico extends SensorBase {
    public String getTipo() {
        return "Sensor de Luminosidade Doméstico";
    }

    public double lerDados() {
        return 220.0;
    }

}
