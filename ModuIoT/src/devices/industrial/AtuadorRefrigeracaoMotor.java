package devices.industrial;

import core.Atuador;

public class AtuadorRefrigeracaoMotor implements Atuador {
    private boolean ligado;

    public String getTipo() {
        return "Atuador Refrigeracao Motor Industrial";
    }

    public void executarAcao(String acao) {
        if("ligar".equalsIgnoreCase(acao)) {
            this.ligado = true;
        }else if("desligar".equalsIgnoreCase(acao)) {
            this.ligado = false;
        }
    }

    public boolean isLigado() {
        return ligado;
    }
}
