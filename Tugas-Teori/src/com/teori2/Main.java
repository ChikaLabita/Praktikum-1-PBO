package com.teori2;

public class Main {

    public static void main(String[] args) {
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    Lingkaran lingkaran = new Lingkaran();
    Segitiga segitiga = new Segitiga();

        System.out.println("Hitung Luas dan Keliling Bangun Datar :  ");;
        persegiPanjang.panjang = 12;
        persegiPanjang.lebar = 8;
        persegiPanjang.luas();
        persegiPanjang.keliling();

        lingkaran.r = 12;
        lingkaran.luas();
        lingkaran.keliling();

        segitiga.alas = 10;
        segitiga.tinggi = 5;
        segitiga.sisiMiring = 3;
        segitiga.luas();
        segitiga.keliling();
    }
}
