package com.exercise1;

public class Manager extends Pegawai{
    private int tunjangan;
    public Manager(String nama, int gaji,int tunjangan){
        super.nama = nama;
        super.gaji = gaji;
        this.tunjangan = tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
    public int getTunjangan(){
        return tunjangan;
    }
}
