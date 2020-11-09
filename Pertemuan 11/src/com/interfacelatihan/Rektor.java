package com.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, Memberikan sertifikat camlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda..");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya Rektor,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------");
    }
}
