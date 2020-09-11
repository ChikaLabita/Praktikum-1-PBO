package com.chika;

public class MainBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "001";
        brg.namaBarang = "Facial Wash";
        brg.hargaDasar = 29950;
        brg.diskon = 20;
        brg.tampilData();
    }
}
