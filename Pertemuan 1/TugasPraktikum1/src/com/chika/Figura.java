package com.chika;

public class Figura {
    private int panjang, lebar;
    private String warna;

    public void setPanjang(int newValue){
        panjang = newValue;
    }
    public void setLebar(int newValue){
        lebar = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void cetakStatus() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Warna : " + warna);
    }
}
