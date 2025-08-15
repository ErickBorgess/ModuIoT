package main;

import java.util.List;
import command.*;
import display.*;
import factory.*;
import core.Atuador;
import core.Sensor;

public class Main {
    public static void main(String[] args) throws Exception {
        //Domestico
        DispositivoFactory fCasa = new CasaInteligenteFactory();
        List<Sensor> sensoresCasa = fCasa.criarSensores();
        List<Atuador> atuadoresCasa = fCasa.criarAtuadores();

        Command cmdCasa = new CommandDomestico(sensoresCasa, atuadoresCasa);
        cmdCasa.executar(); //decide ligar/desligar baseado em Lux/Temp

        //Industrial
        DispositivoFactory fInd = new IndustrialFactory();
        List<Sensor> sensoresInd = fInd.criarSensores();
        List<Atuador> atuadoresInd = fInd.criarAtuadores();

        Command cmdInd = new CommandIndustrial(sensoresInd, atuadoresInd);
        cmdInd.executar(); //decide ligar refrigeração baseado na Temp

        //Displays
        Display displayCasaClaro = new TemaClaroDisplay(new DisplayBasico());
        displayCasaClaro.mostrar(sensoresCasa, atuadoresCasa);

        Display displayIndEscuro = new TemaEscuroDisplay(new DisplayBasico());
        displayIndEscuro.mostrar(sensoresInd, atuadoresInd);
    }
}
