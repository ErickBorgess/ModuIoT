package main;

import java.util.List;

import command.Command;
import command.CommandDomestico;
import command.CommandIndustrial;
import core.Atuador;
import core.Sensor;
import factory.CasaInteligenteFactory;
import factory.DispositivoFactory;
import factory.IndustrialFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        //Domestico
        DispositivoFactory factoryCasa = new CasaInteligenteFactory();
        List<Sensor> sensoresDomesticos = factoryCasa.criarSensores();
        List<Atuador> atuadoresDomesticos = factoryCasa.criarAtuadores();

        Command comandoDomestico = new CommandDomestico(sensoresDomesticos, atuadoresDomesticos);
        comandoDomestico.executar();

        //Industrial
        DispositivoFactory factoryIndustria = new IndustrialFactory();
        List<Sensor> sensoresIndustria = factoryIndustria.criarSensores();
        List<Atuador> atuadoresIndustria = factoryIndustria.criarAtuadores();

        Command comandoIndustrial = new CommandIndustrial(sensoresIndustria, atuadoresIndustria);
        comandoIndustrial.executar();
    }
}
