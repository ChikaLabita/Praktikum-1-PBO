<h1> Laporan Tugas Teori PBO Minggu Ke-6 - Inheritance </h1>


Output : 

<img src="/.tugas.png"/>


Kode :
  

    package com.teori2;

    public class Bangundatar {

    public float luas() {
        System.out.println("Hitung luas bangun datar : ");
        return 0;
    }

    public float keliling() {
        System.out.println("Hitung keliling bangun datar : ");
        return 0;
    }
    }



    package com.teori2;

    public class Lingkaran extends Bangundatar {
    public float r;

    @Override
    public float luas() {
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = (float) (2 * 3.14 * r);
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
    }



    package com.teori2;

    public class PersegiPanjang extends Bangundatar{
    public float panjang, lebar;

    @Override
    public float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Luas Persegi Panjang : " + keliling);
        return keliling;
    }
    }



    package com.teori2;

    public class Segitiga extends Bangundatar{
    public float alas, tinggi, sisiMiring;

    @Override
    public float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = (float) (alas + tinggi + sisiMiring);
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
    }

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
