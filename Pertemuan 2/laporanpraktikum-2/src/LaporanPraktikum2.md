Laporan Praktikum 2

Pemrograman Berbasis Object


1. <img src = "classDiagram.jpg">
2. kode program :

        package com.chika;
    
        public class PeminjamanGame {
        public int id_peminjam;
        public String nama_member, nama_game;
        public double lama_pinjam,harga, hargabayar;
    
        public void tampilData(){
            System.out.println("ID : " + id_peminjam);
            System.out.println("Nama : " + nama_member);
            System.out.println("Nama Game : " + nama_game);
            System.out.println("Lama Pinjam : " + lama_pinjam);
            System.out.println("Harga Game : " + harga);
        }
        public double hargabayar(double lama_pinjam, double harga){
            return lama_pinjam * harga;
        }
    
        }
    
        package com.chika;
        public class Main {
           public static void main(String[] args) {
           PeminjamanGame sewa = new PeminjamanGame();
           sewa.id_peminjam = 101;
           sewa.nama_member = "Zihan";
           sewa.nama_game = "Mobile Legend";
           sewa.lama_pinjam = 10;
           sewa.harga = 65000;
           sewa.tampilData();
           System.out.println("Harga yang harus dibayar : " + sewa.hargabayar(10,65000));
        }
        }

3. kode program

        package com.chika;
    
        public class Lingkaran {
        public double phi, r;
    
        public void tampil(){
            System.out.println("*******LINGKARAN*******");
            System.out.println("jari-jari : " + r);
        }
        public double hitungLuas(double phi, double r){
            return phi * r * r;
        }
        public double hitungKeliling(double phi, double r){
            return  2 * phi * r;
        }
        }
    
    
        package com.chika;
    
        public class mainLingkaran {
        public static void main(String[] args) {
            Lingkaran lngkrn = new Lingkaran();
            lngkrn.phi = 3.14;
            lngkrn.r = 14;
            lngkrn.tampil();
            System.out.println("Luas Lingkaran : " + lngkrn.hitungLuas(3.14,14));
            System.out.println("Keliling Lingkaran : " + lngkrn.hitungKeliling(3.14,14));
        }
        }

4. kode program

            package com.chika;
        
            public class Barang {
            public String kode, namaBarang;
            public int hargaDasar;
            public float diskon;
            public int hitungHargaJual(){
                return (int) (hargaDasar-((diskon/100)*hargaDasar));
            }
            public void tampilData(){
                System.out.println("Kode\t\t : " + kode);
                System.out.println("Nama Barang\t : " + namaBarang);
                System.out.println("Harga Dasar\t : " + hargaDasar);
                System.out.println("Diskon\t\t : " + diskon + "%");
                System.out.println("Harga jual\t : " + hitungHargaJual());
            }
        
            } 

            package com.chika;

            public class MainBarang {
            public static void main(String[] args) {
            Barang brg = new Barang();
            brg.kode = "001";
            brg.namaBarang = "Facial Wash";
            brg.hargaDasar = 29950;
            brg.diskon = 20;
            brg.tampilData();
            }
            }


    