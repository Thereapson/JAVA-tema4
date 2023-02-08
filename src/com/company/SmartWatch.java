package com.company;

import java.nio.DoubleBuffer;

public class SmartWatch extends Dispositivos {

    double registroCardiaco;
    Boolean contandorPasos;

    public  SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, Double peso, int year, String procesador, boolean watch, int bateria, SistemaOperativo sistemaOperativo) {
        super(fabricante, modelo, peso, year, procesador, watch, bateria, sistemaOperativo);
    }

    public SmartWatch(String fabricante, String modelo, Double peso, int year, String procesador, boolean watch, int bateria, double registroCardiaco, Boolean contandorPasos) {
        super(fabricante, modelo, peso, year, procesador, watch, bateria);
        this.registroCardiaco = registroCardiaco;
        this.contandorPasos = contandorPasos;
    }

    public SmartWatch(String fabricante, String modelo, double registroCardiaco, Boolean contandorPasos) {
        super(fabricante, modelo);
        this.registroCardiaco = registroCardiaco;
        this.contandorPasos = contandorPasos;
    }

    public SmartWatch(String fabricante, String modelo, int year, String procesador, double registroCardiaco, Boolean contandorPasos) {
        super(fabricante, modelo, year, procesador);
        this.registroCardiaco = registroCardiaco;
        this.contandorPasos = contandorPasos;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "registroCardiaco=" + registroCardiaco +
                ", contandorPasos=" + contandorPasos +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", year=" + year +
                ", procesador='" + procesador + '\'' +
                ", watch=" + watch +
                ", bateria=" + bateria +
                ", sistemaOperativo=" + sistemaOperativo +
                '}';
    }
}
