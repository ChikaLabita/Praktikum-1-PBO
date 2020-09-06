package com.chika;

public class Kompor2 extends Kompor {
    private int setHarga;
    private String setUkuran, setBerat;
    public void setBerat(String newValue){setBerat = newValue;}
    public void setUkuran(String newValue) {setUkuran = newValue; }
    public void setHarga(int newValue) {setHarga = newValue; }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Ukuran : " + setUkuran);
        System.out.println("Berat : " + setBerat);
        System.out.println("Harga : " + setHarga);
    }
}
