package com.abstractclass;

public class Program {

    public static void main(String[] args) {
	// write your code here
        Kucing kucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
