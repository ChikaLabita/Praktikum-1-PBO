<h1>Laporan Pertemuan 10 - Abstact Class</h1>

Praktikum

    package com.abstractclass;
    
    public abstract class Hewan {
    private int umur;

    protected Hewan(){
        this.umur = 0;
    }

    public void bertambahUmur(){
        this.umur += 1;
    }

    public abstract void bergerak();
    }
    
<br>

    package com.abstractclass;

    public class Kucing extends Hewan {
    @Override
    public void bergerak(){
        System.out.println("Berjalan dengan KAKI, \"Tap..tap..\"");
    }
    }
    
<br>

    package com.abstractclass;

    public class Ikan extends Hewan {
    @Override
    public void bergerak(){
        System.out.println("Berjalan dengan SIRIP, \"wush..wush..\"");
    }
    }
    
 <br>
 
    package com.abstractclass;

    public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama){
        this.nama = nama;
    }

    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
    }
    
 <br>
    
    package com.abstractclass;
    public class Program {

    public static void main(String[] args) {
	// write your code here
        Kucing kucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
    }

<br>

1.5 Pertanyaan Diskusi :
    Tidak boleh. Karena, harus mengimplementasikan method abstract. jika tidak mengimplementasikan maka program tidak dapat dijalankan(error).

1. Berikan penjelasan terkait tentang jalannya program diatas
   Pada class Hewan merupakan class abstract, kemudian menambahkan method abstract bergerak(). 
   dimana method ini akan di-override oleh class turunan, yaitu pada class Kucing maupun Ikan. Lalu, pada class Kucing di extends pada class Hewan, 
   dimana pada class tersebut dibutuhkan @Override karena jika tidak memberikan @Override maka program tidak dapat berjalan (error) begitu juga pada class Ikan. 
   Setelah itu membuat sebuah class Orang digunakan sebagai pengguna dari class abstract Hewan. Class Program digunakan untuk menginstansiasikan class Kucing maupun Ikan.  
2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method bergerak() diubah menjadi method abstract!
   Pada method bergerak() sudah menjadi method abstract, ditandai dengan public abstract void bergerak() , sehingga method ini akan di-override pada class turunan. 
3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap method bergerak()!
   Jika tidak dilakukan overriding pada method bergerak() maka program tidak akan berjalan(error).
4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method bergerak()yang dideklarasikan dalam Class Ikan!
   Maka akan terjadi error, karena class Ikan merupakan turunan dari class Hewan. sehingga cukup satu kali saja deklarasi method bergerak() yaitu pada class Hewan.


