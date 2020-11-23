package com.pertemuan13Kuis;

public class Buku extends MediaInformasi {

    @Override
    public void setJMLHalaman(int jmlHalaman) {
        super.setJMLHalaman(jmlHalaman);
        System.out.println();
        System.out.println("Buku ini memiliki : " + jmlHalaman + " halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut: " + (jmlHalaman+ 4) + " halaman");
    }

    @Override
    public void reputasi() {
        super.reputasi();
        System.out.println();
        System.out.println("Penerbit buku ini bereputasi!");
    }
}
