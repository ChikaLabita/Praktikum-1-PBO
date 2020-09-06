package com.chika;

public class Main {

    public static void main(String[] args) {
	Kerudung krdg = new Kerudung();
	KerudungPashmina krdg2 = new KerudungPashmina();
	KerudungWaterproof krdg3 = new KerudungWaterproof();

	krdg.setMerk("Bella Square");
	krdg.setBahan("Pollycotton Fine");
	krdg.setWarna("Milo");
	krdg.setHarga(22500);
	krdg.cetakStatus();

	krdg2.setMerk("Pashmina Ceruty Babydoll Premium");
	krdg2.setBahan("Ceruty");
	krdg2.setWarna("Maroon");
	krdg2.setHarga(28000);
	krdg2.model("Pashmina");
	krdg2.setUkuran("175 cm x 75 cm");
	krdg2.cetakStatus();

	krdg3.setMerk("Bergo Maryam");
	krdg3.setBahan("Katun");
	krdg3.setWarna("Toska");
	krdg3.setHarga(25000);
	krdg3.setJumlah(10);
	krdg3.setJenisKerudung("Waterproof");
	krdg2.cetakStatus();

    }
}
