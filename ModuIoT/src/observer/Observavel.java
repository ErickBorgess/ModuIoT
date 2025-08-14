package observer;

public interface Observavel {
    public void adicionarObservador(Observador observador);
    public void removerObservador(Observador observador);
    public void notificarObservadores(String mensagem);
}
