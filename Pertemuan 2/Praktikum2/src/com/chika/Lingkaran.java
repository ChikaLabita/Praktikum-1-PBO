package com.chika;

public class Lingkaran {
    public double phi, r;

    public void tampil(){
        System.out.println("*******LINGKARAN*******");
        System.out.println("jari-jari : " + r);
    }
    public double hitungLuas(double phi, double r){
        return phi * r * r;
    }
    public double hitungKeliling(double phi, double r){
        return  2 * phi * r;
    }
}
