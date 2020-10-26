package com.Tugas;

public class MainOverloading {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println(segitiga.totalSudut(10));
        System.out.println(segitiga.totalSudut(10,5));
        System.out.println( segitiga.keliling(12,27));
        System.out.println( segitiga.keliling(12,25,27));

    }
}
