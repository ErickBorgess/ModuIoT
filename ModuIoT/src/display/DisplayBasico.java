package display;

import java.util.List;
import core.Atuador;
import core.Sensor;

public class DisplayBasico implements Display {
    public void mostrar(List<Sensor> sensores, List<Atuador> atuadores) {
        Painel root = new Painel()
            .adicionar(new Titulo("Painel de Dispositivos"))
            .adicionar(new ListaSensores(sensores))
            .adicionar(new ListaAtuadores(atuadores))
            .adicionar(new Texto("------------------------------"));
        root.exibir();
    }
}
