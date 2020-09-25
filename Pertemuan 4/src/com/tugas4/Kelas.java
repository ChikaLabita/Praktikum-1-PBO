package com.tugas4;

public class Kelas {
    private int id_kelas;
    private String nama;

    Kelas(int id_kelas, String nama){
        this.id_kelas = id_kelas;
        this.nama = nama;
    }
    public void setKelas(int id_kelas){
        this.id_kelas = id_kelas;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getId_kelas(){
        return id_kelas;
    }
    public String getNama(){
        return nama;
    }
    public String info(){
        String info = " ";
        info += id_kelas + "\n";
        info += "Kelas\t: " + nama + "\n";
        return info;
    }
}
