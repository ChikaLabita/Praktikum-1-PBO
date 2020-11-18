package com.exercise1;

public class Programer extends Pegawai{
    private int bonus;
    public Programer( String nama,int gaji,int bonus){
        super.nama = nama;
        super.gaji = gaji;
        this.bonus = bonus;
    }
    public int getGaji(){
        return gaji;
    }
    public int getBonus (){
        return bonus;
    }
}
