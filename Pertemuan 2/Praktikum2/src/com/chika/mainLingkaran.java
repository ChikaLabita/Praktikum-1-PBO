package com.chika;

public class mainLingkaran {
    public static void main(String[] args) {
        Lingkaran lngkrn = new Lingkaran();
        lngkrn.phi = 3.14;
        lngkrn.r = 14;
        lngkrn.tampil();
        System.out.println("Luas Lingkaran : " + lngkrn.hitungLuas(3.14,14));
        System.out.println("Keliling Lingkaran : " + lngkrn.hitungKeliling(3.14,14));
    }
}
