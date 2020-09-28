package com.quiz1;

public class Manusia {
    private int umur;
    private String nama;
    private boolean dewasa;

    Manusia(){

    }
    Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa = dewasa;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setDewasa(boolean dewasa){
        this.dewasa = dewasa;
    }
    public int getUmur(){
        return umur;
    }
    public String getNama(){
        return nama;
    }
    public boolean isDewasa(){
        return dewasa;
    }
    public String info(){
        String info = "";
        info += "Umur\t: " + this.umur + "\n";
        info += "Nama\t: " + this.nama + "\n";
        info += "Dewasa\t: " + this.dewasa + "\n";
        return info;
    }

}
