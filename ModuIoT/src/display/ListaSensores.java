package display;

import java.util.List;
import core.Sensor;

public class ListaSensores implements ElementoVisual {
    private final List<Sensor> sensores;

    public ListaSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void exibir() {
        System.out.println("Sensores");
        for (Sensor s : sensores) {
            String unidade = "";
            if (s.getTipo().toLowerCase().contains("temperatura")) unidade = "°C";
            else if (s.getTipo().toLowerCase().contains("luminosidade")) unidade = "Lux";
            double valor = s.lerDados();
            System.out.println("  [->] "+s.getTipo()+": "+valor+unidade);
        }
    }
}
