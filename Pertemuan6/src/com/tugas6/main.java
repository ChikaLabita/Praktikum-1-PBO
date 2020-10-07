package com.tugas6;

public class main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("145621","Kim Seokjin","Seoul");
        dosen.setSKS(16);

        Pegawai pegawai = new Pegawai("145622", "Kim Taehyung", "Seoul");

        DaftarGaji daftarGaji = new DaftarGaji(100);
        daftarGaji.addPegawai(dosen);
        daftarGaji.addPegawai(pegawai);
        daftarGaji.printGaji();
    }
}
