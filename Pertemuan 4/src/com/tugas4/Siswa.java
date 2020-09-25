package com.tugas4;

public class Siswa {
    private String nama, alamat;
    private int nis;
    private Kelas kelas;
    private WaliKelas waliKelas;
    private WaliMurid waliMurid;

    Siswa(int nis, String nama, Kelas kelas, String alamat,  WaliKelas waliKelas, WaliMurid waliMurid){
        this.nis = nis;
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
        this.waliKelas = waliKelas;
        this.waliMurid = waliMurid;
    }

    public void setNis(int nis) {
        this.nis = nis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setWaliKelas(WaliKelas waliKelas) {
        this.waliKelas = waliKelas;
    }

    public void setWaliMurid(WaliMurid waliMurid) {
        this.waliMurid = waliMurid;
    }

    public int getNis() {
        return nis;
    }

    public String getNama() {
        return nama;
    }

    public Kelas getKelas() {
        return kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public WaliKelas getWaliKelas() {
        return waliKelas;
    }

    public WaliMurid getWaliMurid() {
        return waliMurid;
    }

    public String info(){
        String info = "";
        info += "NIS : " + this.nis + "\n";
        info += "Nama : " + this.nama + "\n";
        info += "Id : " + this.kelas.info() + "\n";
        info += "Alamat : " + this.alamat + "\n";
        info += "Wali Kelas : " + this.waliKelas.info() + "\n";
        info += "Wali Murid : " + this.waliMurid.info() + "\n";
        return info;
    }
}
