package com.chika;

public class komporgas extends Kompor {
    private String setJenisKompor;
    private int setjumlahtungku;
    public void setJenisKompor(String newValue) {setJenisKompor = newValue; }
    public void setjumlahtungku(int newValue) {setjumlahtungku = newValue;}
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Jenis Kompor : " + setJenisKompor);
        System.out.println("Jumlah Tungku : " + setjumlahtungku);
    }
}
