package com.chika;
public class Main {
    public static void main(String[] args) {
        PeminjamanGame sewa = new PeminjamanGame();
        sewa.id_peminjam = 101;
        sewa.nama_member = "Zihan";
        sewa.nama_game = "Mobile Legend";
        sewa.lama_pinjam = 10;
        sewa.harga = 65000;
        sewa.tampilData();
        System.out.println("Harga yang harus dibayar : " + sewa.hargabayar(10,65000));
    }
}
