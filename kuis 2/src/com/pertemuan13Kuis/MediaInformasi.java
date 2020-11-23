package com.pertemuan13Kuis;

public class MediaInformasi implements Penerbit {
    public int jmlHalaman;
    private int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        this.tahunSekarang = tahun;
        return tahunSekarang;
    }

    public void setJMLHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;

    }

    @Override
    public void reputasi() {

    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println();
        System.out.println("Alamat penerbit : " + alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println();
        System.out.println("Penerbit ini berdiri pada tahun : " + tahun + ", sehingga penerbit ini berusia : " + (tahunSekarang - tahun) + " tahun" );
    }
}
