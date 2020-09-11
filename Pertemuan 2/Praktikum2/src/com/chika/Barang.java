package com.chika;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hitungHargaJual(){
        return (int) (hargaDasar-((diskon/100)*hargaDasar));
    }
    public void tampilData(){
        System.out.println("Kode\t\t : " + kode);
        System.out.println("Nama Barang\t : " + namaBarang);
        System.out.println("Harga Dasar\t : " + hargaDasar);
        System.out.println("Diskon\t\t : " + diskon + "%");
        System.out.println("Harga jual\t : " + hitungHargaJual());
    }

}
