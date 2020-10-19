package com.uts;

public class Mesin{
    public  String merek;
    public double kecepatan = 0;


    Mesin(){

    }

    public void setMerek(String merekMesin) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(){
        if (getMerek().equalsIgnoreCase("yamaha")){
            System.out.println((kecepatan += 15) + ("km/jam"));
        } else {
            System.out.println((kecepatan += 10) + ("km/jam"));
        }
    }

    public void kurangiKecepatan(){
        if(getMerek().equalsIgnoreCase("yamaha")){
            System.out.println("" + (kecepatan -= 10) + ("km/jam"));
        } else {
            System.out.println("" + (kecepatan -= 5) + ("km/jam"));
        }
    }
}
