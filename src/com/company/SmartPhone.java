package com.company;

public class SmartPhone extends Dispositivos {

    String simCard;
    Boolean appStore;
    Boolean musicPlayer;


    public  SmartPhone(){

    }

    public SmartPhone(String fabricante, String modelo, Double peso, int year, String procesador, boolean watch, int bateria, SistemaOperativo sistemaOperativo, String simCard) {
        super(fabricante, modelo, peso, year, procesador, watch, bateria, sistemaOperativo);
        this.simCard = simCard;
    }

    public SmartPhone(String fabricante, String modelo, Double peso, int year, String procesador, boolean watch, int bateria, String simCard, Boolean appStore, Boolean musicPlayer) {
        super(fabricante, modelo, peso, year, procesador, watch, bateria);
        this.simCard = simCard;
        this.appStore = appStore;
        this.musicPlayer = musicPlayer;
    }

    public SmartPhone(String fabricante, String modelo, String simCard, Boolean appStore, Boolean musicPlayer) {
        super(fabricante, modelo);
        this.simCard = simCard;
        this.appStore = appStore;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "simCard='" + simCard + '\'' +
                ", appStore=" + appStore +
                ", musicPlayer=" + musicPlayer +
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

    public SmartPhone(String fabricante, String modelo, int year, String procesador, String simCard, Boolean appStore, Boolean musicPlayer) {
        super(fabricante, modelo, year, procesador);
        this.simCard = simCard;
        this.appStore = appStore;
        this.musicPlayer = musicPlayer;
    }
}
