package command;

import java.util.List;
import core.Atuador;
import core.Sensor;

public class CommandIndustrial implements Command {
    private List<Sensor> sensores;
    private List<Atuador> atuadores;

    public CommandIndustrial(List<Sensor> sensores, List<Atuador> atuadores) {
        this.sensores = sensores;
        this.atuadores = atuadores;
    }

    public void executar() {
        double temperatura = 0;

        //Leitura dos sensores
        for (Sensor s : sensores) {
            if (s.getTipo().toLowerCase().contains("temperatura")) {
                temperatura = s.lerDados();
            }
        }

        //Atuação com regras
        for (Atuador a : atuadores) {
            if (a.getTipo().toLowerCase().contains("refrigeracao") && temperatura > 100) {
                a.executarAcao("Ligar");
                System.out.println("[COMMAND] Temperatura do motor alta! - " + a.getTipo() + " LIGADO.");
            }else {
                a.executarAcao("Desligar");
                System.out.println("[COMMAND] Temperatura do motor segura ("+temperatura+") - " + a.getTipo() + " DESLIGADO.");
            }
        }
    }
}
