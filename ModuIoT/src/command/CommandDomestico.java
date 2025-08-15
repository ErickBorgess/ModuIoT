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

        // Leitura dos sensores
        for (Sensor s : sensores) {
            if (s.getTipo().toLowerCase().contains("temperatura")) {
                temperatura = s.lerDados();
            } else if (s.getTipo().toLowerCase().contains("luminosidade")) {
                luminosidade = s.lerDados();
            }
        }

        // Atuação com regras
        for (Atuador a : atuadores) {
            String tipo = a.getTipo().toLowerCase();

            if (tipo.contains("ar")) {
                if (temperatura > 25) {
                    a.executarAcao("Ligar");
                    System.out.println("[COMMAND] Temperatura acima de 25°C! - " + a.getTipo() + " LIGADO.");
                } else {
                    a.executarAcao("Desligar");
                    System.out.println("[COMMAND] Temperatura abaixo de 25°C - " + a.getTipo() + " DESLIGADO.");
                }
            } else if (tipo.contains("luz")) {
                if (luminosidade < 220) {
                    a.executarAcao("Ligar");
                    System.out.println("[COMMAND] Luminosidade baixa! - " + a.getTipo() + " LIGADO.");
                } else {
                    a.executarAcao("Desligar");
                    System.out.println("[COMMAND] Luminosidade ok - " + a.getTipo() + " DESLIGADO.");
                }
            }
        }
    }

}
