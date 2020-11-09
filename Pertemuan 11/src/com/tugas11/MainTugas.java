package com.tugas11;

public class MainTugas {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum..Hauum..", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar..Roaaar", "Cokelat");

        //Keledai
        System.out.println("_________________________________");
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        //Gorilla
        System.out.println("_________________________________");
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        //Singa
        System.out.println("_________________________________");
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        System.out.println("_________________________________");
    }
}
