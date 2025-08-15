package core;

public interface Atuador extends Dispositivo {
    void executarAcao(String acao);
    boolean isLigado();
}
