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
