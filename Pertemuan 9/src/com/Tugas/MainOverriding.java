package com.Tugas;

public class MainOverriding {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Manusia b = new Dosen();
        Manusia c = new Mahasiswa();

        System.out.println("_____________________________");
        a.bernafas();
        a.makan();
        System.out.println("_____________________________");
        b.bernafas();
        b.makan();
        System.out.println("_____________________________");
        c.bernafas();
        c.makan();
        System.out.println("_____________________________");
    }
}
