package com.exercise2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        perangkat.voltase = 220;
        if (perangkat instanceof TelevisiJadul){
            System.out.println(((TelevisiJadul) perangkat).getModeInput());
            System.out.println("Voltase televisi : " + ((TelevisiJadul) perangkat).getVoltase());
        } else if (perangkat instanceof TelevisiModern){
            System.out.println(((TelevisiModern) perangkat).getModeInput());
            System.out.println("Voltase televisi : " + ((TelevisiModern) perangkat).getVoltase());
        }
    }
}
