package com.quiz1;

public class Main {
    public static void main(String[] args) {
	Manusia manusia = new Manusia(25, "Andri", true);
	Wanita wanita = new Wanita(20,"Sulis",false,"Sandy","Dony");
	Pria pria = new Pria(23,"Angkasa",false,"neny");

        System.out.println(manusia.info());
        System.out.println(wanita.info());
        System.out.println(pria.info());
    }
}
