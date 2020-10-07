package com.tugas6;

public class DaftarGaji {

    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;

    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai pegawai){
        listPegawai[jumlahPegawaiSekarang] = pegawai;
        jumlahPegawaiSekarang++;
    }

    public void printGaji(){
        for (int i = 0; i < jumlahPegawaiSekarang; i++){
            System.out.print(listPegawai[i].getNama() +" memperoleh gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
