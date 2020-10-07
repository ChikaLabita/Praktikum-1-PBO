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
