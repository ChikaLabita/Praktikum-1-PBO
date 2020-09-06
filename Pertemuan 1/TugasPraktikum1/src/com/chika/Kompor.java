package com.chika;

public class Kompor {
    private String merk, tipe;

    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setTipe(String newValue){
        tipe = newValue;
    }

    public void cetakStatus(){
        System.out.println("Merek : " + merk);
        System.out.println("Tipe : " + tipe);
    }
}
