package com.quiz1;

public class Wanita extends Manusia{
    private Pria suami;
    private Manusia anak;

    Wanita(){

    }
    Wanita(Manusia umur, Manusia nama, Manusia dewasa, Pria suami, Manusia anak){
        if(getUmur() >= 20){
            setSuami(suami);
        } else {
            System.out.println("Wanita ini masih kuliah");
        }
    }

    public void setSuami(Pria suami){
        this.suami = suami;
    }
    public Pria getSuami(){
        return suami;
    }
    public void setAnak(Manusia anak){
        this.anak = anak;
    }
    public Manusia getAnak(){
        return anak;
    }
    public String info(){
        String info = "";
        info += "Umur\t: " + getUmur() + "\n";
        info += "Nama\t: " + getNama() + "\n";
        info += "Dewasa\t: " + isDewasa() + "\n";
        info += "Suami\t: " + getSuami() + "\n";
        info += "Anak\t: " + getAnak() + "\n";
        return info;
    }
}

