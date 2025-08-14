package core;

import observer.Observavel;

public interface Atuador extends Dispositivo, Observavel {
    void executarAcao(String acao);
}
