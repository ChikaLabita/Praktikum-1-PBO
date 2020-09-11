package com.chika;

public class PeminjamanGame {
    public int id_peminjam;
    public String nama_member, nama_game;
    public double lama_pinjam,harga, hargabayar;

    public void tampilData(){
        System.out.println("ID : " + id_peminjam);
        System.out.println("Nama : " + nama_member);
        System.out.println("Nama Game : " + nama_game);
        System.out.println("Lama Pinjam : " + lama_pinjam);
        System.out.println("Harga Game : " + harga);
    }
    public double hargabayar(double lama_pinjam, double harga){
        return lama_pinjam * harga;
    }

}
