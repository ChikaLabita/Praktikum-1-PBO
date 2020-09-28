package com.quiz1;

public class Pria extends Manusia{
    private Wanita istri;

    Pria(){

    }
    Pria(Manusia umur, Manusia nama, Manusia dewasa, Wanita istri){
        if (getUmur() >= 22) {
            setIstri(istri);
        } else {
            System.out.println("Pria ini masih Kuliah");
        }
    }
    public void setIstri(Wanita istri){
        this.istri = istri;
    }
    public Wanita getIstri(){
        return istri;
    }
    public String info(){
        String info = "";
        info += "Umur\t: " + getUmur() + "\n";
        info += "Nama\t: " + getNama() + "\n";
        info += "Dewasa\t: " + isDewasa() + "\n";
        info += "Istri\t: " + getIstri() + "\n";
        return info;
    }
}
