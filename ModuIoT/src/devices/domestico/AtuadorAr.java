package devices.domestico;

import core.Atuador;

public class AtuadorAr implements Atuador {
    private boolean ligado;

    public String getTipo() {
        return "Atuador de Ar Condicionado Domestico";
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
