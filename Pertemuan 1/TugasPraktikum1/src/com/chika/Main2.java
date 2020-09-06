package com.chika;

public class Main2 {
    public static void main(String[] args) {
        Kompor kmpr = new Kompor();
        komporgas kmprgs = new komporgas();
        Kompor2 kmpr2 = new Kompor2();

        kmpr.setMerk("Rinai");
        kmpr.setTipe("RI-301S");
        kmpr.cetakStatus();

        kmprgs.setMerk("Rinai");
        kmprgs.setTipe("RI-301S");
        kmprgs.setJenisKompor("Kompor Gas");
        kmprgs.setjumlahtungku(2);
        kmprgs.cetakStatus();

        kmpr2.setMerk("Cosmos");
        kmpr2.setTipe("CGC 121P");
        kmpr2.setHarga(32500);
        kmpr2.setUkuran("715mmx388mmx105mm");
        kmpr2.setBerat("7520 kg");
        kmpr2.cetakStatus();

    }
}
