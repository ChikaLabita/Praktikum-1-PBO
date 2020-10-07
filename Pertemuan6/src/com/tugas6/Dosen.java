package com.tugas6;

public class Dosen extends Pegawai{

    private int jumlahSKS;
    private final int TARIF_SKS = 250000;

    public Dosen(){

    }

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }

    @Override
    public int getGaji(){
        int total_gaji = jumlahSKS * TARIF_SKS;
        return total_gaji + super.getGaji();
    }
}