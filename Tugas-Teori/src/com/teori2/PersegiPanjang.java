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
