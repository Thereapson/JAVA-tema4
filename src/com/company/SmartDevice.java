package com.company;

public class SmartDevice {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone();
        iPhone.fabricante = "apple";

        SmartWatch iWatch = new SmartWatch();
        iWatch.fabricante = "apple";
        iWatch.registroCardiaco = 96;
        iWatch.contandorPasos = true;
        iWatch.bateria = 50;



        System.out.println(iPhone);
        System.out.println(iWatch);
    }
}
