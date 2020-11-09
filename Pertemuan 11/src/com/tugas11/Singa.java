package com.tugas11;

public class Singa extends Binatang implements Ikarnivora {
    private String suara, warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Makanan\t\t : Daging");
    }

    @Override
    public void displayBinatang(){
        System.out.println("Jenis\t\t : Karnivora ");
    }

    public void displayData() {
        System.out.println("Nama\t\t : " + getNama());
        System.out.println("Jumlah Kaki\t : " + getKaki());
        System.out.println("Suara\t\t : " + this.suara);
        System.out.println("Warna Bulu\t : " + this.warnaBulu);
    }
}
