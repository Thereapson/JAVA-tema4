package com.company;

public class SistemaOperativo {

    // 1. atributos.

    String modelo;
    int licencia;
    String nucleo;

    // 2. constructores.

    public SistemaOperativo(){

    }

    public SistemaOperativo(String modelo, int licencia, String nucleo) {
        this.modelo = modelo;
        this.licencia = licencia;
        this.nucleo = nucleo;
    }
}
