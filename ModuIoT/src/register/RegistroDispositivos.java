package register;

import java.util.ArrayList;
import java.util.List;
import core.Dispositivo;

public class RegistroDispositivos {
    private static RegistroDispositivos instancia;
    private List<Dispositivo> dispositivos;

    private RegistroDispositivos() {
        dispositivos = new ArrayList<>();
    }
    
    public static RegistroDispositivos getInstancia() {
        if(instancia == null) {
            instancia = new RegistroDispositivos();
        }
        return instancia;
    }

    public void adicionarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public List<Dispositivo> getDispositivos() {
       return dispositivos;
    }
}
