package com.pertemuan13Kuis;

public class Majalah extends MediaInformasi {

    @Override
    public void setJMLHalaman(int jmlHalaman) {
        super.setJMLHalaman(jmlHalaman);
        System.out.println("Majalah ini memiliki : " + jmlHalaman + " halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut: " + (jmlHalaman+ 2) + " halaman");
    }

    @Override
    public void reputasi() {
        super.reputasi();
        System.out.println();
        System.out.println("Penerbit majalah ini bereputasi!");
    }
}
