package devices.domestico;

import devices.SensorBase;

public class SensorTemperaturaDomestico extends SensorBase {
    public String getTipo() {
        return "Sensor de Temperatura Doméstico";
    }

    public double lerTemperatura() { //migrar para lerDados()
        return 22.5;
    }

    public String lerDados() { //trecho só para teste, to-do display de informações
        return "[SENSOR]Temperatura do Ambiente: "+lerTemperatura()+"°C";
    }
}
