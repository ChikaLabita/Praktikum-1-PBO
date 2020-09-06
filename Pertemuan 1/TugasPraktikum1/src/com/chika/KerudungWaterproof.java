package com.chika;

public class KerudungWaterproof extends Kerudung {
    private String setJenisKerudung;
    private int setJumlah;

    public void setJenisKerudung(String newValue) {setJenisKerudung = newValue;}
    public void setJumlah(int newValue){setJumlah = newValue;}
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Jenis Kerudung : " + setJenisKerudung);
        System.out.println("Jumlah Kerudung : " + setJumlah);
    }
}
