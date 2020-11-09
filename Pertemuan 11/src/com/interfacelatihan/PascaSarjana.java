package com.interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
        public PascaSarjana(String nama){
            super(nama);
        }

        @Override
        public void lulus(){
            kuliahDiKampus();
            System.out.println("Aku sudah menyelesaikan TESIS");
        }

        @Override
        public void meraihIPKTinggi(){
            System.out.println("IPK-Ku lebih dari 3,71");
        }

        @Override
         public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
        }

        @Override
        public void membuatPublikasiIlmiah() {
        System.out.println("Saya Menerbitkan artikel di jurnal INTERNASIONAL");
        }
}

