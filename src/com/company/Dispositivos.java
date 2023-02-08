package com.company;

public class Dispositivos {

    // 1. atributos

    String fabricante;
    String modelo;
    Double peso;
    int year;
    String procesador;
    boolean watch;
    int bateria;
    SistemaOperativo sistemaOperativo;

    // 2. constructores.

    public Dispositivos(){

    }

    public Dispositivos(
            String fabricante,
            String modelo,
            Double peso,
            int year,
            String procesador,
            boolean watch,
            int bateria,
            SistemaOperativo sistemaOperativo
    ) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.year = year;
        this.procesador = procesador;
        this.watch = watch;
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Dispositivos(
            String fabricante,
            String modelo,
            Double peso,
            int year,
            String procesador,
            boolean watch,
            int bateria
        ){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.procesador = procesador;
        this.watch = watch;
        this.bateria = bateria;
    }

    public  Dispositivos(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Dispositivos(String fabricante, String modelo, int year, String procesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.procesador = procesador;
    }
// 3. metodos.

}
