package com.chika;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Anggotaa donny = new Anggotaa(111333444, "Donny", 5000000);
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjam : ");
        int pinjamUang = in.nextInt();
        donny.pinjam(pinjamUang);
        System.out.println("Jumlah pinjaman saat ini Rp. " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran : ");
        int angsurr= in.nextInt();
        donny.angsur(angsurr);
        System.out.println("Jumlah pinjaman saat ini Rp. " + donny.getJumlahPinjaman());
    }
}
