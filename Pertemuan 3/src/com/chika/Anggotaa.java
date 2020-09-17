package com.chika;

public class Anggotaa {
    private int nik;
    private String nama;
    private int limit_peminjaman;
    private int jumlah_pinjaman;

    Anggotaa(int nik, String nama, int limit_peminjaman){
        this.nik = nik;
        this.nama = nama;
        this.limit_peminjaman = limit_peminjaman;
    }
    public void setNik(int nik){
        this.nik = nik;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public int getNik(int nik){
        return nik;
    }
    public int getLimitPinjaman(){
        return limit_peminjaman;
    }
    public int getJumlahPinjaman(){
        return jumlah_pinjaman;
    }
    public void pinjam(int pinjam){
        if (pinjam <= 5000000 ){
            jumlah_pinjaman += pinjam;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(int uang){
        if (uang >= jumlah_pinjaman*10/100){
            jumlah_pinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
