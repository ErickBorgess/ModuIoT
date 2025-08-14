package devices;

import java.util.ArrayList;
import java.util.List;

import core.Sensor;
import observer.Observador;

public abstract class SensorBase implements Sensor {
    private List<Observador> observadores = new ArrayList<>();
    
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for(Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}
