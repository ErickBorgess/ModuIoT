package command;

import java.util.List;
import core.Atuador;
import core.Sensor;

public class CommandDomestico implements Command {
    private List<Sensor> sensores;
    private List<Atuador> atuadores;

    public CommandDomestico(List<Sensor> sensores, List<Atuador> atuadores) {
        this.sensores = sensores;
        this.atuadores = atuadores;
    }

    public void executar() {
        double temperatura = 0;
        double luminosidade = 0;

        //Leitura dos sensores
        for (Sensor s : sensores) {
            if(s.getTipo().toLowerCase().contains("temperatura")) {
                temperatura = s.lerDados();
            }else if (s.getTipo().toLowerCase().contains("luminosidade")) {
                luminosidade = s.lerDados();
            }
        }

        //Atuação com regras
        for (Atuador a : atuadores) {
            if(a.getTipo().toLowerCase().contains("ar") && temperatura > 25) {
                a.executarAcao("Ligar");
            }else if(a.getTipo().toLowerCase().contains("luz") && luminosidade < 220) {
                a.executarAcao("Ligar");
            }
        }

    }

}
