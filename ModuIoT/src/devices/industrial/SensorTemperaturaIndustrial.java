package devices.industrial;

import devices.SensorBase;

public class SensorTemperaturaIndustrial extends SensorBase{
    public String getTipo() {
        return "Sensor de Temperatura Industrial";
    }

    public double lerTemperatura() { //migrar para lerDados()
        return 56.7;
    }

    public String lerDados() { //trecho só para teste, to-do display de informações
        return "[SENSOR]Temperatura da Máquina: "+lerTemperatura()+"";
    }
}
