package core;

import observer.Observavel;

public interface Sensor extends Dispositivo, Observavel{
    double lerDados();
}
