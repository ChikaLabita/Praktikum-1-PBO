package com.tugas4;

public class Main {
    public static void main(String[] args) {
        Kelas kelas = new Kelas(1,"1-A");
        WaliKelas waliKelas = new WaliKelas(101201,"085749124565","IndahAyu");
        WaliMurid waliMurid = new WaliMurid(1,"085214501245","Aidah Lestari", "Ibu Kandung");
        Siswa siswa = new Siswa(19417,"Indria Lestari",kelas,"Malang",waliKelas,waliMurid);

        System.out.println(siswa.info());
    }
}
