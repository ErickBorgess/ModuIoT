package register;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import core.Atuador;
import core.Sensor;
//import java.util.ArrayList;
//import core.Dispositivo;

public class RegistroDispositivos {
    /*private static RegistroDispositivos instancia;
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
   }*/
   private static final String ARQUIVO = "dispositivos.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void salvar(List<Sensor> sensores, List<Atuador> atuadores) {
        try (FileWriter writer = new FileWriter(ARQUIVO)) {
            DadosSistema dados = new DadosSistema(sensores, atuadores);
            gson.toJson(dados, writer);
            System.out.println("[JSON] Dispositivos salvos em " + ARQUIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DadosSistema carregar() {
        try (FileReader reader = new FileReader(ARQUIVO)) {
            return gson.fromJson(reader, DadosSistema.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
