package com.chika;

public class Kerudung {

        private String merk, bahan, warna;
        private  int harga;

        public void setMerk(String newValue){
            merk = newValue;
        }
        public void setBahan(String newValue){
            bahan = newValue;
        }
        public void setWarna(String newValue){
            warna = newValue;
        }
        public void setHarga(int newValue) { harga = newValue; }
        public void cetakStatus(){
            System.out.println("Merek : " + merk);
            System.out.println("Bahan : " + bahan);
            System.out.println("Warna : " + warna);
            System.out.println("Harga : " + harga);
        }

}
